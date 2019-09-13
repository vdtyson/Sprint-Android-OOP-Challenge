package com.versilistyson.sprintprojectweek6.model.structures

data class Structure(
    val age: String,
    val armor: String,
    val attack: Int,
    val build_time: Int,
    val cost: Cost,
    val expansion: String,
    val hit_points: Int,
    val id: Int,
    val line_of_sight: Int,
    val name: String,
    val range: String,
    val reload_time: Double,
    val special: List<String>
)