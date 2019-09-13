package com.versilistyson.sprintprojectweek6.model.common

import android.util.Log
import com.versilistyson.sprintprojectweek6.AOERequestApi
import com.versilistyson.sprintprojectweek6.model.technologies.Technology
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
open class Item () {

    enum class ItemType(type: String) {
        Civilization("Civilization"),
        Structure("Structure"),
        Technology("Technology"),
        Unit("Unit"),
        All("All")
    }

    open val classType: ItemType = ItemType.All
    var isFavorite: Boolean = false

    val retriever = AOERequestApi.create()
    fun getItemDescription(): String {
        var itemDescription: String = ""

        when(classType) {
            ItemType.Civilization -> itemDescription = "This is a civilization"
            ItemType.Structure -> itemDescription = "This is a structure"
            ItemType.Technology -> itemDescription = "This is a Technology"
            ItemType.Unit -> itemDescription = "This is a Unit"
            else -> itemDescription = ""
        }
        return itemDescription
    }
}
