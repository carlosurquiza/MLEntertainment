package cl.cdum.mlentertainment.data.model.categoryItemDetail

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "categoryItemDetailDataTable")
data class CategoryItemDetailData(
    @PrimaryKey val id: String,
    @SerializedName("accepts_mercadopago")
    val accepts_mercadopago: Boolean? = null,
    @SerializedName("attributes")
    val attributes: List<Attribute>? = null,
    @SerializedName("automatic_relist")
    val automatic_relist: Boolean? = null,
    @SerializedName("available_quantity")
    val available_quantity: Int? = null,
    @SerializedName("base_price")
    val base_price: Double? = null,
    @SerializedName("buying_mode")
    val buying_mode: String? = null,
    @SerializedName("catalog_listing")
    val catalog_listing: Boolean? = null,
    @SerializedName("catalog_product_id")
    val catalog_product_id: String? = null,
    @SerializedName("category_id")
    val category_id: String? = null,
    @SerializedName("channels")
    val channels: List<String>? = null,
    @SerializedName("condition")
    val condition: String? = null,
    @SerializedName("coverage_areas")
    val coverage_areas: List<String>? = null,
    @SerializedName("currency_id")
    val currency_id: String? = null,
    @SerializedName("date_created")
    val date_created: String? = null,
    @SerializedName("deal_ids")
    val deal_ids: List<String>? = null,
    @SerializedName("descriptions")
    val descriptions: List<String>? = null,
    @SerializedName("differential_pricing")
    val differential_pricing: Int? = null,
    @SerializedName("domain_id")
    val domain_id: String? = null,
    @SerializedName("health")
    val health: Double? = null,
    @SerializedName("initial_quantity")
    val initial_quantity: Int? = null,
    @SerializedName("international_delivery_mode")
    val international_delivery_mode: String? = null,
    @SerializedName("last_updated")
    val last_updated: String? = null,
    @SerializedName("listing_source")
    val listing_source: String? = null,
    @SerializedName("listing_type_id")
    val listing_type_id: String? = null,
    @SerializedName("location")
    val location: Location? = null,
    @SerializedName("non_mercado_pago_payment_methods")
    val non_mercado_pago_payment_methods: List<PaymentMethod>? = null,
    @SerializedName("official_store_id")
    val official_store_id: Int? = null,
    @SerializedName("original_price")
    val original_price: Double? = null,
    @SerializedName("parent_item_id")
    val parent_item_id: String? = null,
    @SerializedName("permalink")
    val permalink: String? = null,
    @SerializedName("pictures")
    val pictures: List<Picture>? = null,
    @SerializedName("price")
    val price: Double? = null,
    @SerializedName("sale_terms")
    val sale_terms: List<SaleTerm>? = null,
    @SerializedName("secure_thumbnail")
    val secure_thumbnail: String? = null,
    @SerializedName("seller_address")
    val seller_address: SellerAddress? = null,
    @SerializedName("seller_contact")
    val seller_contact: String? = null,
    @SerializedName("seller_id")
    val seller_id: Int? = null,
    @SerializedName("shipping")
    val shipping: Shipping? = null,
    @SerializedName("site_id")
    val site_id: String? = null,
    @SerializedName("sold_quantity")
    val sold_quantity: Int? = null,
    @SerializedName("start_time")
    val start_time: String? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("stop_time")
    val stop_time: String? = null,
    @SerializedName("sub_status")
    val sub_status: List<SubStatus>? = null,
    @SerializedName("subtitle")
    val subtitle: String? = null,
    @SerializedName("tags")
    val tags: List<String>? = null,
    @SerializedName("thumbnail")
    val thumbnail: String? = null,
    @SerializedName("thumbnail_id")
    val thumbnail_id: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("variations")
    val variations: List<Variation>? = null,
    @SerializedName("video_id")
    val video_id: String? = null,
    @SerializedName("warnings")
    val warnings: List<String>? = null,
    @SerializedName("warranty")
    val warranty: String? = null
)