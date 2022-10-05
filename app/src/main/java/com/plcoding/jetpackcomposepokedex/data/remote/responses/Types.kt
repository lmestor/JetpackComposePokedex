package com.plcoding.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName


data class Types (

  @SerializedName("slot" ) var slot : Int?  = null,
  @SerializedName("type" ) var type : Type? = Type()

)