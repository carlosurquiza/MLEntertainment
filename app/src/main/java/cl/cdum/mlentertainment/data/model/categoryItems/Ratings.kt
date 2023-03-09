package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class Ratings(
    @SerializedName("negative")
    val negative: Double? = null,
    @SerializedName("neutral")
    val neutral: Double? = null,
    @SerializedName("positive")
    val positive: Double? = null
)