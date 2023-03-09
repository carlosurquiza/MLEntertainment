package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class Cancellations(
    @SerializedName("period")
    val period: String? = null,
    @SerializedName("rate")
    val rate: Double? = null,
    @SerializedName("value")
    val value: Int? = null
)