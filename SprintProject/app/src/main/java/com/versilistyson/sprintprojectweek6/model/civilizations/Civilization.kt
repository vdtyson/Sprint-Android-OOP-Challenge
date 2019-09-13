package com.versilistyson.sprintprojectweek6.model.civilizations

import com.versilistyson.sprintprojectweek6.model.common.Item

data class Civilization (
    override val name: String,
    override val shortDescription: String,
    override val longDescription: String

) : Item {
    override var isFavorite: Boolean = false
    override val classType: Item.ItemType = Item.ItemType.Civilization

}