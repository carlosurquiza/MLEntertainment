package cl.cdum.mlentertainment.api

import cl.cdum.mlentertainment.data.model.categoryItemDetail.CategoryItemDetailData
import cl.cdum.mlentertainment.data.model.categoryItems.CategoryItemsData
import cl.cdum.mlentertainment.data.model.homeCategories.HomeCategoriesData
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    companion object {
        const val GET_CATEGORY_DATA = "categories/{category_id}"
        const val GET_CATEGORY_ITEMS_SEARCH = "sites/MLA/search"
        const val GET_CATEGORY_ITEM_DETAIL = "items/{item_id}"
    }

    @GET(GET_CATEGORY_DATA)
    suspend fun getCategoryData(
        @Path("category_id") categoryId: String
    ): HomeCategoriesData

    @GET(GET_CATEGORY_ITEMS_SEARCH)
    suspend fun getCategoryItems(
        @Query("category") categoryId: String
    ): CategoryItemsData

    @GET(GET_CATEGORY_ITEMS_SEARCH)
    suspend fun getCategoryItemsSearch(
        @Query("q") searchCriteria: String
    ): CategoryItemsData

    @GET(GET_CATEGORY_ITEM_DETAIL)
    suspend fun getCategoryItemDetail(
        @Path("item_id") id: String
    ): CategoryItemDetailData
}