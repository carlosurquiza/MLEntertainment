package cl.cdum.mlentertainment.data.model.homeCategories

import com.google.gson.annotations.SerializedName

data class ChannelsSetting(
    @SerializedName("channel")
    val channel: String? = null,
    @SerializedName("settings")
    val settings: Settings? = null
)