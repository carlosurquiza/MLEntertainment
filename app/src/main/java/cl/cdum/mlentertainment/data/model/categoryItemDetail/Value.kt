package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class Value(
    @SerializedName("id")
    val valueId: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("struct")
    val struct: Struct? = null
)