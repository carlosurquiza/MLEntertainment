package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class ValueStruct(
    @SerializedName("number")
    val number: Int? = null,
    @SerializedName("unit")
    val unit: String? = null
)