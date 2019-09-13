package com.versilistyson.sprintprojectweek6.model.common

import android.util.Log
import com.versilistyson.sprintprojectweek6.AOERequestApi
import com.versilistyson.sprintprojectweek6.model.technologies.Technology
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
interface Item {

    enum class ItemType(type: String) {
        Civilization("Civilization"),
        Structure("Structure"),
        Technology("Technology"),
        Unit("Unit"),
        All("All")
    }
    val name: String
    val classType: ItemType
    var isFavorite: Boolean
    val shortDescription: String
    val longDescription: String

    fun getItemShortDescription(): String {
       return shortDescription
    }
    fun getItemLongDescription(): String {
        return longDescription
    }
}
