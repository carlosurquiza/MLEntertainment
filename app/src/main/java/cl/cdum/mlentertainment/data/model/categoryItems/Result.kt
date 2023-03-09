package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class CategoryResult(
    @SerializedName("accepts_mercadopago")
    val accepts_mercadopago: Boolean? = null,
    @SerializedName("address")
    val address: Address? = null,
    @SerializedName("attributes")
    val attributes: List<Attribute>? = null,
    @SerializedName("available_quantity")
    val available_quantity: Int? = null,
    @SerializedName("buying_mode")
    val buying_mode: String? = null,
    @SerializedName("catalog_product_id")
    val catalog_product_id: String? = null,
    @SerializedName("category_id")
    val category_id: String? = null,
    @SerializedName("condition")
    val condition: String? = null,
    @SerializedName("currency_id")
    val currency_id: String? = null,
    @SerializedName("differential_pricing")
    val differential_pricing: DifferentialPricing? = null,
    @SerializedName("discounts")
    val discounts: Any? = null,
    @SerializedName("domain_id")
    val domain_id: String? = null,
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("installments")
    val installments: Installments? = null,
    @SerializedName("inventory_id")
    val inventory_id: Any? = null,
    @SerializedName("listing_type_id")
    val listing_type_id: String? = null,
    @SerializedName("official_store_id")
    val official_store_id: Int? = null,
    @SerializedName("official_store_name")
    val official_store_name: String? = null,
    @SerializedName("order_backend")
    val order_backend: Int? = null,
    @SerializedName("original_price")
    val original_price: Double? = null,
    @SerializedName("permalink")
    val permalink: String? = null,
    @SerializedName("price")
    val price: Double? = null,
    @SerializedName("promotions")
    val promotions: List<Any>? = null,
    @SerializedName("sale_price")
    val sale_price: Any? = null,
    @SerializedName("seller")
    val seller: Seller? = null,
    @SerializedName("seller_address")
    val seller_address: SellerAddress? = null,
    @SerializedName("shipping")
    val shipping: Shipping? = null,
    @SerializedName("site_id")
    val site_id: String? = null,
    @SerializedName("sold_quantity")
    val sold_quantity: Int? = null,
    @SerializedName("stop_time")
    val stop_time: String? = null,
    @SerializedName("tags")
    val tags: List<String>? = null,
    @SerializedName("thumbnail")
    val thumbnail: String? = null,
    @SerializedName("thumbnail_id")
    val thumbnail_id: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("use_thumbnail_id")
    val use_thumbnail_id: Boolean? = null,
    @SerializedName("winner_item_id")
    val winner_item_id: Any? = null
)