package org.buffer.android.onboarding

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.DrawableRes

data class OnboardingStep(
    val titleResource: Int,
    val descriptionResource: Int,
    @DrawableRes val imageResource: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(titleResource)
        parcel.writeInt(descriptionResource)
        parcel.writeInt(imageResource)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<OnboardingStep> {
        override fun createFromParcel(parcel: Parcel): OnboardingStep {
            return OnboardingStep(parcel)
        }

        override fun newArray(size: Int): Array<OnboardingStep?> {
            return arrayOfNulls(size)
        }
    }
}