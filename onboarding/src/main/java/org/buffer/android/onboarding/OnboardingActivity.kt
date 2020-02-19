package org.buffer.android.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {

    private lateinit var onboardingListener: OnboardingListener
    private lateinit var onboardingAdapter: OnboardingAdapter

    companion object {

        const val EXTRA_ONBOARDING_STEPS =
            "org.buffer.android.onboarding.OnboardingActivity.EXTRA_ONBOARDING_STEPS"
        const val EXTRA_ONBOARDING_LISTENER =
            "org.buffer.android.onboarding.OnboardingActivity.EXTRA_ONBOARDING_LISTENER"
        const val EXTRA_FLIP_LAYOUT =
            "org.buffer.android.onboarding.OnboardingActivity.EXTRA_REVERSE_LAYOUT"
        const val EXTRA_LOGO_RESOURCE =
            "org.buffer.android.onboarding.OnboardingActivity.EXTRA_LOGO_RESOURCE"

        fun getStartIntent(
            context: Context,
            steps: ArrayList<OnboardingStep>,
            onboardingListener: OnboardingListener
        ): Intent {
            return getStartIntent(context, steps, onboardingListener, -1, false)
        }

        fun getStartIntent(
            context: Context,
            steps: ArrayList<OnboardingStep>,
            onboardingListener: OnboardingListener,
            @DrawableRes logoResource: Int,
            flipLayout: Boolean = true
        ): Intent {
            return Intent(context, OnboardingActivity::class.java).apply {
                putParcelableArrayListExtra(EXTRA_ONBOARDING_STEPS, steps)
                putExtra(EXTRA_ONBOARDING_LISTENER, onboardingListener)
                putExtra(EXTRA_LOGO_RESOURCE, logoResource)
                putExtra(EXTRA_FLIP_LAYOUT, flipLayout)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        onboardingListener =
            intent.getSerializableExtra(EXTRA_ONBOARDING_LISTENER) as OnboardingListener
        onboardingAdapter = OnboardingAdapter(this,
            intent.getBooleanExtra(EXTRA_FLIP_LAYOUT, false))

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

            override fun onPageSelected(position: Int) { }
        })

        setupLogo(intent.getIntExtra(EXTRA_LOGO_RESOURCE, -1))
    }

    private fun setButtonClickListeners() {
        button_new_user.setOnClickListener {
            onboardingListener.showSignUpForm(this)
        }
        button_existing_user.setOnClickListener {
            onboardingListener.showSignInForm(this)
        }
    }

    private fun setupOnboardingPager(steps: ArrayList<OnboardingStep>) {
        onboardingAdapter.steps = steps
        pager_onboarding.adapter = onboardingAdapter
        view_indicator.attachViewPager(pager_onboarding,
            resources.getDrawable(R.drawable.circle_black))
    }

    private fun setupLogo(@DrawableRes logoResource: Int) {
        if (logoResource != -1) {
            image_logo.setImageResource(logoResource)
            image_logo.visibility = View.VISIBLE
        } else {
            image_logo.visibility = View.GONE
        }
    }
}