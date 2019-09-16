package com.versilistyson.sprintprojectweek6.model.civilizations

import android.os.Parcelable
import com.versilistyson.sprintprojectweek6.model.common.Item
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

class Civilization (
    name: String,
    shortDescription: String,
    longDescription: String,
    isFavorite: Boolean = false
) : Item(name = name,shortDescription =shortDescription,longDescription = longDescription,isFavorite =  isFavorite), Serializable {


}