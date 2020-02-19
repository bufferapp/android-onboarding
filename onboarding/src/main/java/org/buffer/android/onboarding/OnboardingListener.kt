package org.buffer.android.onboarding

import android.app.Activity
import java.io.Serializable

interface OnboardingListener: Serializable {

    fun showSignUpForm(activity: Activity)

    fun showSignInForm(activity: Activity)
}