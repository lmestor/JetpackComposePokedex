package com.plcoding.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName


data class Stats (

  @SerializedName("base_stat" ) var baseStat : Int?  = null,
  @SerializedName("effort"    ) var effort   : Int?  = null,
  @SerializedName("stat"      ) var stat     : Stat? = Stat()

)