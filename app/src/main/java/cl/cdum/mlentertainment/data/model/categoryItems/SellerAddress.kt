package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class SellerAddress(
    @SerializedName("address_line")
    val address_line: String? = null,
    @SerializedName("city")
    val city: City? = null,
    @SerializedName("comment")
    val comment: String? = null,
    @SerializedName("country")
    val country: Country? = null,
    @SerializedName("id:")
    val id: Any? = null,
    @SerializedName("latitude")
    val latitude: Any? = null,
    @SerializedName("longitude")
    val longitude: Any? = null,
    @SerializedName("state")
    val state: State? = null,
    @SerializedName("zip_code")
    val zip_code: String? = null
)