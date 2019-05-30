package org.buffer.android.onboarding

import android.app.Activity

interface OnboardingNavigator {

    fun showSignUpForm(activity: Activity)

    fun showSignInForm(activity: Activity)
}