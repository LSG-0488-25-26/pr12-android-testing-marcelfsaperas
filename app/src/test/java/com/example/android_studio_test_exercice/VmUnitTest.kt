package com.example.android_studio_test_exercice

import org.junit.Test

import org.junit.Assert.*
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.compose.ui.state.ToggleableState
import com.example.android_studio_test_exercice.viewmodel.MainViewModel
import org.junit.Rule
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class vmUnitTest {

    @get:Rule val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testToggleEstatSwitch() {
        val viewModel = MainViewModel()
        // El valor inicial es true
        viewModel.toggleEstatSwitch()
        assertEquals(false, viewModel.estatSwitch.value)
    }

    @Test
    fun testToggleEsVegetaria() {
        val viewModel = MainViewModel()
        // El valor inicial es false
        viewModel.toggleEsVegetaria()
        assertEquals(true, viewModel.esVegetaria.value)
    }

    @Test
    fun testSetSelectedOption() {
        val viewModel = MainViewModel()
        val player = "Lamine Yamal"
        viewModel.setSelectedOption(player)
        assertEquals(player, viewModel.selectedOption.value)
    }

    @Test
    fun testSetSliderValue() {
        val viewModel = MainViewModel()
        val valor = 45f
        viewModel.setSliderValue(valor)
        assertEquals(valor, viewModel.sliderValue.value)
    }

    @Test
    fun testToggleTriStateStatus() {
        val viewModel = MainViewModel()
        // inicialment ha d'estar en off
        viewModel.toggleTriStateStatus()
        assertEquals(ToggleableState.Indeterminate, viewModel.triStateStatus.value)
    }

    @Test
    fun testSetSearchText() {
        val viewModel = MainViewModel()
        val query = "Android Test"
        viewModel.setSearchText(query)
        assertEquals(query, viewModel.searchText.value)
    }

    @Test
    fun testToggleState() {
        val viewModel = MainViewModel()
        // Inicialment es false
        viewModel.toggle()
        assertEquals(true, viewModel.toggleState.value)
    }
}