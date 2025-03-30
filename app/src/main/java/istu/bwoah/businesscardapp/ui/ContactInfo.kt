package istu.bwoah.businesscardapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun ContactInfo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "+7 (912) 462 78 50", fontSize = 16.sp, color = Color.Black)
        Text(text = "mechkov.igor04@gmail.com", fontSize = 16.sp, color = Color.Black)
        Text(text = "github.com/WolfOfBad", fontSize = 16.sp, color = Color.Black)
    }
}