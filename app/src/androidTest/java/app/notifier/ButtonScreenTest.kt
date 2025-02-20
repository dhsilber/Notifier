package app.notifier

import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import app.notifier.ui.ButtonScreen
import app.notifier.ui.theme.NotifierTheme
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

class ButtonScreenTest {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun `button exists`() = runTest {
        composeRule.setContent {
            NotifierTheme {
                ButtonScreen()
            }
        }

        composeRule
            .onNodeWithText("Notify!")
            .assertIsDisplayed()
            .assertHasClickAction()
//            .performClick()
    }

}
