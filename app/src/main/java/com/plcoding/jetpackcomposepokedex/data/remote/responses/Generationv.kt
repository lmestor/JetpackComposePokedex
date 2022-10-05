package com.plcoding.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName


data class Generationv (

  @SerializedName("black-white" ) var blackwhite : Blackwhite? = Blackwhite()

)