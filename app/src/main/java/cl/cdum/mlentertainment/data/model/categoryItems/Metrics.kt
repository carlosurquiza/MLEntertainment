package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class Metrics(
    @SerializedName("cancellations")
    val cancellations: Cancellations? = null,
    @SerializedName("claims")
    val claims: Claims? = null,
    @SerializedName("delayed_handling_time")
    val delayed_handling_time: DelayedHandlingTime? = null,
    @SerializedName("sales")
    val sales: Sales? = null
)