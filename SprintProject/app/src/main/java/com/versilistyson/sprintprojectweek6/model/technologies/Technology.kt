package com.versilistyson.sprintprojectweek6.model.technologies

import android.os.Parcelable
import com.versilistyson.sprintprojectweek6.model.common.Item
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

class Technology(
     name: String,
    shortDescription: String,
     longDescription: String,
     isFavorite: Boolean = false
) : Serializable, Item(name = name,shortDescription =shortDescription,longDescription = longDescription,isFavorite =  isFavorite) {

}