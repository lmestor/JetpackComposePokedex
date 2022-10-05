package com.plcoding.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName


data class Generationiv (

  @SerializedName("diamond-pearl"        ) var diamondpearl        : Diamondpearl?        = Diamondpearl(),
  @SerializedName("heartgold-soulsilver" ) var heartgoldsoulsilver : Heartgoldsoulsilver? = Heartgoldsoulsilver(),
  @SerializedName("platinum"             ) var platinum             : Platinum?             = Platinum()

)