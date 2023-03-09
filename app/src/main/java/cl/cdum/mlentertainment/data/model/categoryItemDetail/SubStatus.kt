package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class SubStatus(
    @SerializedName("banned")
    val banned: String? = null,
    @SerializedName("deleted")
    val deleted: String? = null,
    @SerializedName("forbidden")
    val forbidden: String? = null,
    @SerializedName("freezed")
    val freezed: String? = null,
    @SerializedName("held")
    val held: String? = null,
    @SerializedName("pending_documentation")
    val pending_documentation: String? = null,
    @SerializedName("suspended")
    val suspended: String? = null,
    @SerializedName("waiting_for_patch")
    val waiting_for_patch: String? = null,
    @SerializedName("warning")
    val warning: String? = null
)
