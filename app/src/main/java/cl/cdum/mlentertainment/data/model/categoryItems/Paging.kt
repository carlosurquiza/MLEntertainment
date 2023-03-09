package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class Paging(
    @SerializedName("limit")
    val limit: Int? = null,
    @SerializedName("offset")
    val offset: Int? = null,
    @SerializedName("primary_results")
    val primary_results: Int? = null,
    @SerializedName("total")
    val total: Int? = null
)