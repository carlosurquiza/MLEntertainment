package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class Installments(
    @SerializedName("amount")
    val amount: Double? = null,
    @SerializedName("currency_id")
    val currency_id: String? = null,
    @SerializedName("quantity")
    val quantity: Int? = null,
    @SerializedName("rate")
    val rate: Double? = null
)