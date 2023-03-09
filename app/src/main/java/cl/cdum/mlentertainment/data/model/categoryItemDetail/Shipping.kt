package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class Shipping(
    @SerializedName("dimensions")
    val dimensions: Any? = null,
    @SerializedName("free_shipping")
    val free_shipping: Boolean? = null,
    @SerializedName("local_pick_up")
    val local_pick_up: Boolean? = null,
    @SerializedName("logistic_type")
    val logistic_type: String? = null,
    @SerializedName("methods")
    val methods: List<Any>? = null,
    @SerializedName("mode")
    val mode: String? = null,
    @SerializedName("store_pick_up")
    val store_pick_up: Boolean? = null,
    @SerializedName("tags")
    val tags: List<String>? = null
)