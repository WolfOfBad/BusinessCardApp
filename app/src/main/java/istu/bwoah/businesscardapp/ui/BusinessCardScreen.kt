package istu.bwoah.businesscardapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCardScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff3aabab))
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfileImage()

            Text(
                text = "Mechkov Igor",
                fontSize = 42.sp,
                color = Color.Black,
            )
            Text(
                text = "DevOps engineer",
                fontSize = 24.sp,
                color = Color.DarkGray
            )
        }

        ContactInfo(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 32.dp)
        )
    }
}