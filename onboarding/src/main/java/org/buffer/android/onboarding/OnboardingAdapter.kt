package org.buffer.android.onboarding

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class OnboardingAdapter constructor(
    private val context: Context,
    private val flipLayout: Boolean
) : PagerAdapter() {

    var steps: List<OnboardingStep> = emptyList()

    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        val onboardingStep = steps[position]
        val onboardingView = OnboardingView(context, flipLayout = flipLayout)
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