package org.buffer.android.onboarding.widget

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.viewpager.widget.ViewPager
import org.buffer.android.onboarding.util.DisplayMetricsUtil

class PagerIndicatorView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : LinearLayout(context, attrs, defStyle) {

    private val indicatorSize = DisplayMetricsUtil.dpToPx(7)
    private val indicatorMargin = DisplayMetricsUtil.dpToPx(5)
    private var viewPager: ViewPager? = null

    init {
        orientation = LinearLayout.HORIZONTAL
    }

    /**
     * Attaches the view pager to this indicator. Please make sure your you set a PagerAdapter in
     * your ViewPager before calling this method.
     */
    fun attachViewPager(viewPager: ViewPager, drawable: Drawable) {
        detachViewPager()

        this.viewPager = viewPager
        this.viewPager!!.addOnPageChangeListener(onPageChangeListener)

        updateIndicatorViews(drawable)
    }

    /**
     * Clear any listener set in the view pager and its reference.
     */
    fun detachViewPager() {
        if (viewPager != null) {
            viewPager!!.removeOnPageChangeListener(onPageChangeListener)
            viewPager = null
        }
    }

    fun updateIndicatorViews(indicator: Drawable) {
        val adapter = viewPager!!.adapter
            ?: throw RuntimeException("Set a PagerAdapter in the ViewPager before attaching it")
        updateViewIndicators(adapter.count, indicator)
        selectIndicatorAtPosition(viewPager?.currentItem ?: 0, false)
    }

    private fun updateViewIndicators(
        numIndicators: Int,
        drawable: Drawable
    ) {
        removeAllViews()

        for (i in 0 until numIndicators) {
            addView(makeIndicatorView(drawable))
        }
    }

    private fun makeIndicatorView(drawable: Drawable): View {
        val view = View(context)
        val params = LinearLayout.LayoutParams(indicatorSize, indicatorSize)
        params.setMargins(indicatorMargin, indicatorMargin, indicatorMargin, indicatorMargin)
        view.layoutParams = params
        view.setBackgroundDrawable(drawable)
        return view
    }

    private fun selectIndicatorAtPosition(
        position: Int,
        animated: Boolean
    ) {
        for (i in 0..childCount - 1) {
            val child = getChildAt(i)
            if (i == position) {
                child.alpha = 1f
                scaleViewTo(child, 1.5f, animated)
            } else {
                child.alpha = 0.3f
                scaleViewTo(child, 1f, animated)
            }
        }
    }

    private fun scaleViewTo(
        view: View,
        scale: Float,
        animated: Boolean
    ) {
        if (view.scaleX == scale && view.scaleY == scale) return

        if (animated) {
            view.animate()
                .scaleX(scale).scaleY(scale)
                .setDuration(200)
                .start()
        } else {
            view.scaleX = scale
            view.scaleY = scale
        }
    }

    private val onPageChangeListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) { }

        override fun onPageSelected(position: Int) {
            selectIndicatorAtPosition(position, true)
        }

        override fun onPageScrollStateChanged(state: Int) { }
    }
}