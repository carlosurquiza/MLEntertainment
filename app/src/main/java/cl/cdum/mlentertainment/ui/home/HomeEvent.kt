package cl.cdum.mlentertainment.ui.home

sealed class HomeEvent {
    data class NavigateToCategoryItems(val searchCriteria: String) : HomeEvent()
}