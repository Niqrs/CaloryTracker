package com.plcoding.onboarding_presentation.weight

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.core.R
import com.plcoding.core.domain.preferences.Preferences
import com.plcoding.core.navigation.Route
import com.plcoding.core.util.UiEvent
import com.plcoding.core.util.UiText
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeightViewModel @Inject constructor(
    private val preferences: Preferences,
) : ViewModel() {

    var weight by mutableStateOf("80.0") //TODO: it should depend on gender
        private set

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    fun onWeightEnter(weight: String) { // TODO: Weight should be only 3 digits before dot
        if (weight.length <= 5) {
            this.weight = weight
        }
    }

    fun onNextClick() { //TODO: It shouldn't start with 0
        viewModelScope.launch {
            val weightNumber = weight.toFloatOrNull() ?: kotlin.run {
                _uiEvent.send(
                    UiEvent.ShowSnackbar(
                        UiText.StringResource(R.string.error_weight_cant_be_empty)
                    )
                )
                return@launch
            }
            preferences.saveWeight(weightNumber)
            _uiEvent.send(UiEvent.Navigate(Route.ACTIVITY))
        }
    }
}