package cl.cdum.mlentertainment.ui.categoryItems

sealed class CategoryItemsEvent {
    data class NavigateToItemDetail(val id: String) : CategoryItemsEvent()
    data class NavigateToCategoryItems(val searchCriteria: String) : CategoryItemsEvent()
}