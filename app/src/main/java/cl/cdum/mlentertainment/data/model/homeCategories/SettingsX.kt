package cl.cdum.mlentertainment.data.model.homeCategories

import com.google.gson.annotations.SerializedName

data class SettingsX(
    @SerializedName("adult_content")
    val adult_content: Boolean? = null,
    @SerializedName("buyer_protection_programs")
    val buyer_protection_programs: List<String>? = null,
    @SerializedName("buying_allowed")
    val buying_allowed: Boolean? = null,
    @SerializedName("buying_modes")
    val buying_modes: List<String>? = null,
    @SerializedName("catalog_domain")
    val catalog_domain: String? = null,
    @SerializedName("coverage_areas")
    val coverage_areas: String? = null,
    @SerializedName("currencies")
    val currencies: List<String>? = null,
    @SerializedName("fragile")
    val fragile: Boolean? = null,
    @SerializedName("immediate_payment")
    val immediate_payment: String? = null,
    @SerializedName("item_conditions")
    val item_conditions: List<String>? = null,
    @SerializedName("items_reviews_allowed")
    val items_reviews_allowed: Boolean? = null,
    @SerializedName("listing_allowed")
    val listing_allowed: Boolean? = null,
    @SerializedName("max_description_length")
    val max_description_length: Int? = null,
    @SerializedName("max_pictures_per_item")
    val max_pictures_per_item: Int? = null,
    @SerializedName("max_pictures_per_item_var")
    val max_pictures_per_item_var: Int? = null,
    @SerializedName("max_sub_title_length")
    val max_sub_title_length: Int? = null,
    @SerializedName("max_title_length")
    val max_title_length: Int? = null,
    @SerializedName("max_variations_allowed")
    val max_variations_allowed: Int? = null,
    @SerializedName("maximum_price")
    val maximum_price: Any? = null,
    @SerializedName("maximum_price_currency")
    val maximum_price_currency: String? = null,
    @SerializedName("minimum_price")
    val minimum_price: Int? = null,
    @SerializedName("minimum_price_currency")
    val minimum_price_currency: String? = null,
    @SerializedName("mirror_category")
    val mirror_category: Any? = null,
    @SerializedName("mirror_master_category")
    val mirror_master_category: Any? = null,
    @SerializedName("mirror_slave_categories")
    val mirror_slave_categories: List<Any>? = null,
    @SerializedName("price")
    val price: String? = null,
    @SerializedName("reservation_allowed")
    val reservation_allowed: String? = null,
    @SerializedName("restrictions")
    val restrictions: List<Any>? = null,
    @SerializedName("rounded_address")
    val rounded_address: Boolean? = null,
    @SerializedName("seller_contact")
    val seller_contact: String? = null,
    @SerializedName("shipping_options")
    val shipping_options: List<String>? = null,
    @SerializedName("shipping_profile")
    val shipping_profile: String? = null,
    @SerializedName("show_contact_information")
    val show_contact_information: Boolean? = null,
    @SerializedName("simple_shipping")
    val simple_shipping: String? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("stock")
    val stock: String? = null,
    @SerializedName("sub_vertical")
    val sub_vertical: String? = null,
    @SerializedName("subscribable")
    val subscribable: Boolean? = null,
    @SerializedName("tags")
    val tags: List<Any>? = null,
    @SerializedName("vertical")
    val vertical: String? = null,
    @SerializedName("vip_subdomain")
    val vip_subdomain: String? = null
)