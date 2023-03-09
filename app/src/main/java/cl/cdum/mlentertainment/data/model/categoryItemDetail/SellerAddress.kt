package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class SellerAddress(
    @SerializedName("city")
    val city: City? = null,
    @SerializedName("country")
    val country: Country? = null,
    @SerializedName("id")
    val sellerAddressId: Int? = null,
    @SerializedName("search_location")
    val search_location: SearchLocation? = null,
    @SerializedName("state")
    val state: StateX? = null
)