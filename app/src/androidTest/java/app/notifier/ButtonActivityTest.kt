package app.notifier

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

class ButtonActivityTest {
    @get:Rule
    val composeActivityRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun `main activity contains notify button`() = runTest {
        composeActivityRule.onNodeWithText("Notify!").assertIsDisplayed()
    }

}
