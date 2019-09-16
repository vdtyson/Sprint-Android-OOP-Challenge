package com.versilistyson.sprintprojectweek6.model.common

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

open class Item(  var name: String = "",
             var isFavorite: Boolean = false,
             var shortDescription: String = "",
             var longDescription: String = ""
) : Serializable {



    fun getItemShortDescription(): String {
       return shortDescription
    }
    fun getItemLongDescription(): String {
        return longDescription
    }
}
