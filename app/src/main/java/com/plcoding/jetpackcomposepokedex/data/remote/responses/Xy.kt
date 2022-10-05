package com.plcoding.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName


data class Xy (

  @SerializedName("front_default"      ) var frontDefault     : String? = null,
  @SerializedName("front_female"       ) var frontFemale      : String? = null,
  @SerializedName("front_shiny"        ) var frontShiny       : String? = null,
  @SerializedName("front_shiny_female" ) var frontShinyFemale : String? = null

)