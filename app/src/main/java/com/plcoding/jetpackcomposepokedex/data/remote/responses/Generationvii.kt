package com.plcoding.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName


data class Generationvii (

  @SerializedName("icons"                ) var icons                : Icons?                = Icons(),
  @SerializedName("ultra-sun-ultra-moon" ) var ultrasunultramoon : Ultrasunultramoon? = Ultrasunultramoon()

)