package org.buffer.android.onboarding

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import javax.inject.Inject

class OnboardingAdapter @Inject constructor(val context: Context) : PagerAdapter() {

    var steps: List<OnboardingStep> = emptyList()

    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        val onboardingStep = steps[position]
        val onboardingView = OnboardingView(context)
        onboardingView.setOnboardingStep(onboardingStep)
        collection.addView(onboardingView)
        return onboardingView
    }

    override fun destroyItem(collection: ViewGroup, position: Int, view: Any) {
        collection.removeView(view as View)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {
        return steps.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        val customPagerEnum = steps[position]
        return context.getString(customPagerEnum.titleResource)
    }
}