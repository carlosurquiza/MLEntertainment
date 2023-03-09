package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("address_line")
    val address_line: String? = null,
    @SerializedName("city")
    val city: City? = null,
    @SerializedName("country")
    val country: Country? = null,
    @SerializedName("neighborhood")
    val neighborhood: Neighborhood? = null,
    @SerializedName("state")
    val state: StateX? = null,
    @SerializedName("zip_code")
    val zip_code: String? = null,
)