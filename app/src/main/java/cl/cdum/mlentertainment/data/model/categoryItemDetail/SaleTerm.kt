package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class SaleTerm(
    @SerializedName("id")
    val saleTermId: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("value_id")
    val value_id: String? = null,
    @SerializedName("value_name")
    val value_name: String? = null,
    @SerializedName("value_struct")
    val value_struct: ValueStruct? = null,
    @SerializedName("value_type")
    val value_type: String? = null,
    @SerializedName("values")
    val values: List<Value>? = null
)