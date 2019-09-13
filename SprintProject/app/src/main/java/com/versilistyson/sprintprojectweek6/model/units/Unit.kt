package com.versilistyson.sprintprojectweek6.model.units

import com.versilistyson.sprintprojectweek6.model.common.Item
import com.versilistyson.sprintprojectweek6.model.common.Item.ItemType.Unit

class ItemTypeUnit (
    override val name: String,
    override val shortDescription: String,
    override val longDescription: String
) : Item {
    override var isFavorite: Boolean = false
    override val classType: Item.ItemType = Unit
}