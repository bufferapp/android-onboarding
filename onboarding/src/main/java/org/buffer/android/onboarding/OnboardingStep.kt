package org.buffer.android.onboarding

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OnboardingStep(
    val titleResource: Int,
    val descriptionResource: Int?,
    @DrawableRes val imageResource: Int
) : Parcelable
