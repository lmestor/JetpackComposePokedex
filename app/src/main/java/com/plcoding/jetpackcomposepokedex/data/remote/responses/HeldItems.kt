package com.plcoding.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName


data class HeldItems (

    @SerializedName("item"            ) var item           : Item?                     = Item(),
    @SerializedName("version_details" ) var versionDetails : ArrayList<VersionDetails> = arrayListOf()

)