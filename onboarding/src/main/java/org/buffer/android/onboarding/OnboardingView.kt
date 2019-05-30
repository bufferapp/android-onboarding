package org.buffer.android.onboarding

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.view_onboarding.view.image_onboarding
import kotlinx.android.synthetic.main.view_onboarding.view.text_description
import kotlinx.android.synthetic.main.view_onboarding.view.text_title

class OnboardingView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    init {
        LayoutInflater.from(context).inflate(R.layout.view_onboarding, this)
    }

    fun setOnboardingStep(onboardingStep: OnboardingStep) {
        text_title.text = context.getString(onboardingStep.titleResource)
        text_description.text = context.getString(onboardingStep.descriptionResource)
        image_onboarding.setImageDrawable(ContextCompat.getDrawable(context,
            onboardingStep.imageResource))
    }
}