package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class PaymentMethod(
    @SerializedName("id")
    val paymentMethodId: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("type")
    val type: String? = null
)