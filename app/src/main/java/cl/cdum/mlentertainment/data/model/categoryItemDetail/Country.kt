package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("id")
    val countryId: String? = null,
    @SerializedName("name")
    val name: String? = null
)