package com.versilistyson.sprintprojectweek6.viewmodel

import com.versilistyson.sprintprojectweek6.model.civilizations.Civilization
import com.versilistyson.sprintprojectweek6.model.common.Item
import com.versilistyson.sprintprojectweek6.model.structures.Structure
import com.versilistyson.sprintprojectweek6.model.technologies.Technology
import com.versilistyson.sprintprojectweek6.model.units.ItemTypeUnit

class AOEItemMockData {
    fun addToList() : List<Item> {
        val list = mutableListOf<Item>()
        civilizationList.forEach { list.add(it) }
        structureList.forEach { list.add(it) }
        technologyList.forEach { list.add(it) }
        unitList.forEach { list.add(it) }
        return list
    }
    val civilizationList = listOf<Civilization> (
        Civilization(
            "Aztecs",
            "The Assyrians are the inhabitants of the ancient kingdom of Assyria",
            "The Assyrians are the inhabitants of the ancient kingdom of Assyria, which once controlled Mesopotamia and parts of Northeast Syria, and are a playable civilization in Age of Empires. They are strictly an offensive civilization and are excellent in small maps and games that start out with low resources."
        ),
        Civilization(
            "Babylonians",
            "The Babylonians were the inhabitants of the Babylonian Empire, which once controlled the region of Mesopotamia at its height.",
            "The Babylonians were the inhabitants of the Babylonian Empire, which once controlled the region of Mesopotamia at its height. They are a playable civilization in Age of Empires and are primarily a defensive civilization in both land and water maps. They can survive multiple enemy rushes with their doubled Tower and Wall hit points bonus. Villagers gather stone 30% faster and their Priests regain their faith 30% faster, making them a good choice for beginners or those who favor a turtling strategy."
        ),
        Civilization(
            "Choson",
            "The Choson is the name of an ancient Korean kingdom (approximately 108 BC), that was located in the capital city at Wanggeom. ",
            "The Choson (고조선; Ko-Choson; Ancient Choson) is the name of an ancient Korean kingdom (approximately 108 BC), that was located in the capital city at Wanggeom. It is one of the three playable East Asian civilizations in Age of Empires. They are one of the most frequently used civilizations in multiplayer, mostly in Deathmatches. They are both an offensive and defensive civilization and are powerful from the Bronze Age to the Iron Age. All of the Choson buildings have a distinct Asian-styled architecture, along with the Yamato and the Shang, due to it being an Asian civilization."
        )

    )
    val structureList = listOf<Structure>(
        Structure(
            "Watch Tower",
            "The Watch Tower is a tower in Age of Empires. In order to be built, it must first be researched at the Granary for 50 food.",
            "The Watch Tower is a tower in Age of Empires. In order to be built, it must first be researched at the Granary for 50 food. The Watch Tower can be upgraded in later Ages at the Granary. It is available to all civilizations. Watch Towers are more resistant against stone throwing siege weapons unlike other buildings, having 18 additional siege armor against them after accounting for building armor. Against Armored Elephants, Watch Towers have 16 extra armor."
        ),
        Structure(
            "Gaurd Tower",
            "The Guard Tower is the second best type of tower in Age of Empires.",
            "The Guard Tower is the second best type of tower in Age of Empires. It is available first on the Iron Age, after upgrading the Sentry Tower from the Granary. To research the technology that provides this kind of tower, 300 food and 100 stone is required. This unit starts out with 200 hit points, 6 attack and 7 range. The stats can be upgraded. It offers effective defense against other Bronze Age units, but needs to be upgraded to the Ballista Tower to have any kind of effectiveness against Iron Age units. Almost every civilization can build this type of tower. The only exceptions to this are the Romans, the Minoans, and the Yamato. Like all towers, Guard Towers are more resistant against stone throwing siege weapons unlike other buildings, having 18 additional siege armor against them after accounting for building armor. Against Armored Elephants, Guard Towers have 16 extra armor."
        ),
        Structure(
                "Small Wall",
        "The Small Wall is an early part of fortification available for all civilizations in the game Age of Empires.",
            "Built with stone, this is the first wall that can be built for a civilization, an artificial barrier that can’t be passed by any unit, but can be destroyed. Small Walls does not offer much resistance compared to other buildings, but is cheap and can be built far more quickly. This makes it ideal to cordon off a place on the map and defend it against early rushes from the Stone to the Tool Age. Walls have no attack, and is used only for obstructing and protecting vulnerable areas. Players often place towers, archers or other long range units behind the walls."
        )
    )
    val technologyList = listOf<Technology>(
        Technology(
            "Town Center",
            "The Town Center is an economic building in Age of Empires that becomes available once the Bronze Age is reached.",
            "The Town Center is an economic building in Age of Empires that becomes available once the Bronze Age is reached. As it trains Villagers, advances through Ages, and serves as a drop off point for all resources, it is the most important of all buildings. Town Centers also provide four population."
            ),
        Technology(
                "Sentry Tower",
        "The Sentry Tower is a tower in Age of Mythology.",
        "The Sentry Tower is a tower in Age of Mythology. It plays a similar role to the other towers featured in the Age of Empires series. However, just like the Outpost in the Age of Empires II, these towers do not attack enemy units within range. They are used as lookouts, but can be upgraded to the Watch Tower in the Classical Age. For the Egyptians, the upgrade is automatic on entering the Classical Age."
        ),
        Technology(
             "Scale Mail Armor",
            "cale Mail Armor is a technology in Age of Empires II that can be researched at the Blacksmith. ",
            "Scale Mail Armor is a technology in Age of Empires II that can be researched at the Blacksmith. Once researched, it increases infantry armor and pierce armor by +1. Chain Mail Armor is the further upgrade of this technology."
        )
    )
    val unitList = listOf<ItemTypeUnit>(
        ItemTypeUnit(
            "Villager",
            "The Villager is a worker unit in Age of Mythology that is only available to the Greeks. ",
            "The Villager is a worker unit in Age of Mythology that is only available to the Greeks. Villagers are essential in gathering the resources with which to develop the player's army and build structures to expand your empire. A strong empire has many Villagers. In times of emergency, Villagers are fair fighters, but they are best left to what they do well - gathering resources and constructing buildings."
        ),
        ItemTypeUnit(
                "Hippolyta",
                "Classical Age archer hero",
            "Hippolyta is the Classical Age archer hero for Poseidon in Age of Mythology."
        ),
        ItemTypeUnit(
                "Jason",
                "Archaic Age hero",
                "Jason is the Archaic Age hero for Zeus"
        )
    )
}