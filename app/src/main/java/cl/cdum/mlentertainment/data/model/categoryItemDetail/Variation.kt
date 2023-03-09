package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class Variation(
    @SerializedName("attribute_combinations")
    val attribute_combinations: List<AttributeCombination>? = null,
    @SerializedName("available_quantity")
    val available_quantity: Int? = null,
    @SerializedName("catalog_product_id")
    val catalog_product_id: Any? = null,
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("picture_ids")
    val picture_ids: List<String>? = null,
    @SerializedName("price")
    val price: Int? = null,
    @SerializedName("sale_terms")
    val sale_terms: List<Any>? = null,
    @SerializedName("sold_quantity")
    val sold_quantity: Int? = null
)
