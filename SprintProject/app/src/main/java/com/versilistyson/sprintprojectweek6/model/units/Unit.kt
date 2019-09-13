package com.versilistyson.sprintprojectweek6.model.units

data class Unit(
    val accuracy: String,
    val age: String,
    val armor: String,
    val armor_bonus: List<String>,
    val attack: Int,
    val attack_bonus: List<String>,
    val attack_delay: Double,
    val blast_radius: Double,
    val build_time: Int,
    val cost: Cost,
    val created_in: String,
    val description: String,
    val expansion: String,
    val hit_points: Int,
    val id: Int,
    val line_of_sight: Int,
    val movement_rate: Double,
    val name: String,
    val range: Int,
    val reload_time: Double,
    val search_radius: Int
)