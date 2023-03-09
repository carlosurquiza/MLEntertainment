package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class Picture(
    @SerializedName("id")
    val pictureId: String? = null,
    @SerializedName("max_size")
    val max_size: String? = null,
    @SerializedName("quality")
    val quality: String? = null,
    @SerializedName("secure_url")
    val secure_url: String? = null,
    @SerializedName("size")
    val size: String? = null,
    @SerializedName("url")
    val url: String? = null
)