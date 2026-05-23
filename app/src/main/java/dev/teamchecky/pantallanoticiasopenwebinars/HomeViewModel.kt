package dev.teamchecky.pantallanoticiasopenwebinars

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.teamchecky.pantallanoticiasopenwebinars.data.mocks.newsSummaryMock
import dev.teamchecky.pantallanoticiasopenwebinars.ui.theme.HomeState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    private val mutableState = MutableStateFlow<HomeState>(HomeState.Loading)
    val state: StateFlow<HomeState> = mutableState.asStateFlow()

    init {
        loadNews()
    }

    fun loadNews(){
        viewModelScope.launch(Dispatchers.IO) {
            delay(2000)
            mutableState.update { HomeState.Data(newsSummaryMock) }
        }
    }
}