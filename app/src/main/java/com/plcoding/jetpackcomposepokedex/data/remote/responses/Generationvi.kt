package com.plcoding.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName


data class Generationvi (

  @SerializedName("omegaruby-alphasapphire" ) var omegarubyalphasapphire : Omegarubyalphasapphire? = Omegarubyalphasapphire(),
  @SerializedName("x-y"                     ) var xy                     : Xy?                     = Xy()

)