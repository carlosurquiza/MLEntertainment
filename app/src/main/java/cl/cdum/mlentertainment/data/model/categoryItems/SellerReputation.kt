package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class SellerReputation(
    @SerializedName("level_id")
    val level_id: String,
    @SerializedName("metrics")
    val metrics: Metrics,
    @SerializedName("power_seller_status")
    val power_seller_status: String,
    @SerializedName("transactions")
    val transactions: Transactions
)