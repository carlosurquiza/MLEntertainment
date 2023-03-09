package cl.cdum.mlentertainment.data.model.homeCategories

import com.google.gson.annotations.SerializedName

data class Settings(
    @SerializedName("buying_modes")
    val buying_modes: List<String>? = null,
    @SerializedName("immediate_payment")
    val immediate_payment: String? = null,
    @SerializedName("minimum_price")
    val minimum_price: Int? = null,
    @SerializedName("status")
    val status: String? = null
)