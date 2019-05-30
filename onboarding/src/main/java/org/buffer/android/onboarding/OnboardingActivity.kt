package org.buffer.android.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_onboarding.button_existing_user
import kotlinx.android.synthetic.main.activity_onboarding.button_new_user
import kotlinx.android.synthetic.main.activity_onboarding.pager_onboarding
import kotlinx.android.synthetic.main.activity_onboarding.view_indicator
import javax.inject.Inject

class OnboardingActivity : AppCompatActivity() {

    @Inject lateinit var onboardingAdapter: OnboardingAdapter
    @Inject lateinit var onboardingCoordinator: OnboardingNavigator
    @Inject lateinit var onboardingTracker: OnboardingAnalytics

    private var hasTrackedOnboardingInteraction = false

    companion object {

        const val EXTRA_ONBOARDING_STEPS = "org.buffer.android.onboarding.OnboardingActivity"

        fun getStartIntent(context: Context, steps: ArrayList<OnboardingStep>): Intent {
            return Intent(context, OnboardingActivity::class.java).apply {
                putParcelableArrayListExtra(EXTRA_ONBOARDING_STEPS, steps)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        AndroidInjection.inject(this)
        onboardingTracker.setAccessibilityUserProperty()
        onboardingTracker.trackWelcomeScreenOpened()

        setButtonClickListeners()
        setupOnboardingPager(
            intent.getParcelableArrayListExtra<OnboardingStep>(EXTRA_ONBOARDING_STEPS))

        pager_onboarding.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) { }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) { }

            override fun onPageSelected(position: Int) {
                if (!hasTrackedOnboardingInteraction) {
                    hasTrackedOnboardingInteraction = true
                    onboardingTracker.trackOnboardingInteractedWith()
                }
            }
        })
    }

    private fun setButtonClickListeners() {
        button_new_user.setOnClickListener {
            onboardingCoordinator.showSignUpForm(this)
        }
        button_existing_user.setOnClickListener {
            onboardingCoordinator.showSignInForm(this)
        }
    }

    private fun setupOnboardingPager(steps: ArrayList<OnboardingStep>) {
        onboardingAdapter.steps = steps
        pager_onboarding.adapter = onboardingAdapter
        view_indicator.attachViewPager(pager_onboarding,
            resources.getDrawable(R.drawable.circle_black))
    }
}