package com.versilistyson.sprintprojectweek6.model.structures

import android.content.ClipData
import com.versilistyson.sprintprojectweek6.model.common.Item

data class Structure(
    override val name: String,
    override val shortDescription: String,
    override val longDescription: String

) : Item {
    override var isFavorite: Boolean = false
    override val classType: Item.ItemType = Item.ItemType.Structure
}