package org.buffer.android.onboarding

interface OnboardingAnalytics {

    fun trackWelcomeScreenOpened()

    fun trackOnboardingInteractedWith()

    fun setAccessibilityUserProperty()
}