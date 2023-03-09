package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class Seller(
    @SerializedName("_")
    val underscore: Boolean? = null,
    @SerializedName("car_dealer")
    val car_dealer: Boolean? = null,
    @SerializedName("car_dealer_logo")
    val car_dealer_logo: String? = null,
    @SerializedName("eshop")
    val eshop: Eshop? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("nickname")
    val nickname: String? = null,
    @SerializedName("permalink")
    val permalink: String? = null,
    @SerializedName("real_estate_agency")
    val real_estate_agency: Boolean? = null,
    @SerializedName("registration_date")
    val registration_date: String? = null,
    @SerializedName("seller_reputation")
    val seller_reputation: SellerReputation? = null,
    @SerializedName("tags")
    val tags: List<String>? = null
)