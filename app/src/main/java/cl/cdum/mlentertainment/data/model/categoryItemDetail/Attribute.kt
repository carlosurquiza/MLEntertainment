package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class Attribute(
    @SerializedName("attribute_group_id")
    val attribute_group_id: String? = null,
    @SerializedName("attribute_group_name")
    val attribute_group_name: String? = null,
    @SerializedName("id")
    val attributeId: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("value_id")
    val value_id: String? = null,
    @SerializedName("value_name")
    val value_name: String? = null,
    @SerializedName("value_struct")
    val value_struct: Any? = null,
    @SerializedName("value_type")
    val value_type: String? = null,
    @SerializedName("values")
    val values: List<Value>? = null
)