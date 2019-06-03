package org.buffer.android.onboarding

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.view_onboarding.view.image_onboarding
import kotlinx.android.synthetic.main.view_onboarding.view.text_description
import kotlinx.android.synthetic.main.view_onboarding.view.text_title
import org.buffer.android.onboarding.util.DisplayMetricsUtil

class OnboardingView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    private val flipLayout: Boolean = false
) : LinearLayout(context, attrs, defStyle) {

    init {
        orientation = VERTICAL
        layoutParams = LayoutParams(MATCH_PARENT, MATCH_PARENT)
        val padding = DisplayMetricsUtil.dpToPx(16)
        setPadding(padding, 0, padding, 0)
        if (flipLayout) {
            LayoutInflater.from(context)
                .inflate(R.layout.view_onboarding_flipped, this)
        } else {
            LayoutInflater.from(context)
                .inflate(R.layout.view_onboarding, this)
        }
    }

    fun setOnboardingStep(onboardingStep: OnboardingStep) {
        text_title.text = context.getString(onboardingStep.titleResource)
        if (!flipLayout) text_description.text = context.getString(onboardingStep.descriptionResource)
        image_onboarding.setImageDrawable(ContextCompat.getDrawable(context,
            onboardingStep.imageResource))
    }
}