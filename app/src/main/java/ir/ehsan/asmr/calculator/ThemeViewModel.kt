package ir.ehsan.asmr.calculator

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.compositionLocalOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

val LocalTheme = compositionLocalOf<ThemeViewModel> { ThemeViewModel() }

class ThemeViewModel(): ViewModel() {

    private val _darkMode:MutableStateFlow<Boolean> = MutableStateFlow(false)
    val darkMode = _darkMode.asStateFlow()

    fun toggleTheme(){
        _darkMode.update { !it }
    }

}