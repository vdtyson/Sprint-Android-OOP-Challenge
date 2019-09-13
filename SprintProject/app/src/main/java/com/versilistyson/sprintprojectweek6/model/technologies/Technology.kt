package com.versilistyson.sprintprojectweek6.model.technologies

data class Technology(
    val age: String,
    val applies_to: List<String>,
    val build_time: Int,
    val cost: Cost,
    val description: String,
    val develops_in: String,
    val expansion: String,
    val id: Int,
    val name: String
)