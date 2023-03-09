package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class Filter(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("values")
    val values: List<ValueX>? = null
)