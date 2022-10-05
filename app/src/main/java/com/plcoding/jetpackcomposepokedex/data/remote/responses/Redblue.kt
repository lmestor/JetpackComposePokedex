package com.plcoding.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName


data class Redblue (

  @SerializedName("back_default"      ) var backDefault      : String? = null,
  @SerializedName("back_gray"         ) var backGray         : String? = null,
  @SerializedName("back_transparent"  ) var backTransparent  : String? = null,
  @SerializedName("front_default"     ) var frontDefault     : String? = null,
  @SerializedName("front_gray"        ) var frontGray        : String? = null,
  @SerializedName("front_transparent" ) var frontTransparent : String? = null

)