package com.example.android_studio_test_exercice

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android_studio_test_exercice.view.MainView
import com.example.android_studio_test_exercice.viewmodel.MainViewModel

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import androidx.compose.ui.test.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class vmInstrumentedTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private val viewModel = MainViewModel()

    @Before
    fun setup() {
        composeTestRule.setContent {
            MainView(myViewModel = viewModel)
        }
    }

    @Test
    fun escriure_en_buscador_actualitza_vm() {
        val textoPrueba = "Probando instrumental"

        // Cosa de la IA pq donaba error: Buscar específicamente el nodo que permite escribir texto
        composeTestRule
            .onNode(hasSetTextAction())
            .performTextInput(textoPrueba)

        // Opción B (si tienes varios campos): Buscar por el texto exacto del label
        // composeTestRule.onNodeWithText("Buscar...").performTextInput(textoPrueba)

        assertEquals(textoPrueba, viewModel.searchText.value)
    }

    @Test
    fun seleccionar_jugador_radiobutton() {
        composeTestRule.onNodeWithText("Lamine Yamal").performClick()

        assertEquals("Lamine Yamal", viewModel.selectedOption.value)
    }

    @Test
    fun buscar_muestra_mensaje_exito() {
        // Pulsamos el boton que dice buscar
        composeTestRule.onNodeWithText("Buscar").performClick()

        composeTestRule.onNodeWithText("Acció completada!").assertExists()
    }

    @Test
    fun dropdown_se_abre_al_clicar() {
        composeTestRule.onNodeWithText("Opció A").performClick()
        composeTestRule.onNodeWithText("Opció B").assertExists()
    }
}