package com.plcoding.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName


data class Other (

  @SerializedName("dream_world"      ) var dreamWorld       : DreamWorld?       = DreamWorld(),
  @SerializedName("home"             ) var home             : Home?             = Home(),
  @SerializedName("official-artwork" ) var officialartwork : Officialartwork? = Officialartwork()

)