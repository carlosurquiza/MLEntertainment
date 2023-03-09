package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class Eshop(
    @SerializedName("eshop_experience")
    val eshop_experience: Int? = null,
    @SerializedName("eshop_id")
    val eshop_id: Int? = null,
    @SerializedName("eshop_locations")
    val eshop_locations: List<Any>? = null,
    @SerializedName("eshop_logo_url")
    val eshop_logo_url: String? = null,
    @SerializedName("eshop_rubro")
    val eshop_rubro: Any? = null,
    @SerializedName("eshop_status_id")
    val eshop_status_id: Int? = null,
    @SerializedName("nick_name")
    val nick_name: String? = null,
    @SerializedName("seller")
    val seller: Int? = null,
    @SerializedName("site_id")
    val site_id: String? = null
)