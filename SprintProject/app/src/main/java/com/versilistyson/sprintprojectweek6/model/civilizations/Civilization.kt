package com.versilistyson.sprintprojectweek6.model.civilizations

data class Civilization(
    val armyType: String,
    val civilization_bonus: List<String>,
    val expansion: String,
    val id: Int,
    val name: String,
    val team_bonus: String,
    val uniqueTech: List<String>,
    val uniqueUnit: List<String>
)