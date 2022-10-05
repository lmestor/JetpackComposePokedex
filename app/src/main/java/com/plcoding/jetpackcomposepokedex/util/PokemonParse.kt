package com.plcoding.jetpackcomposepokedex.util

import androidx.compose.ui.graphics.Color
import com.plcoding.jetpackcomposepokedex.data.remote.responses.Stat
import com.plcoding.jetpackcomposepokedex.data.remote.responses.Type
import com.plcoding.jetpackcomposepokedex.ui.theme.*
import java.util.*

fun parseTypeToColor(type: Type): Color {
    return when(type.name?.lowercase()) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.name?.lowercase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.name?.lowercase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}