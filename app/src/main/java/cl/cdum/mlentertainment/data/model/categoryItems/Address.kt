package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("city_id")
    val city_id: String? = null,
    @SerializedName("city_name")
    val city_name: String? = null,
    @SerializedName("state_id")
    val state_id: String? = null,
    @SerializedName("state_name")
    val state_name: String? = null
)