package istu.bwoah.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardScreen()
        }
    }
}

@Composable
fun BusinessCardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff3aabab)),
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
        Spacer(modifier = Modifier.height(24.dp))
        ContactInfo()
    }

}

@Composable
fun ProfileImage() {
    Image(
        painter = painterResource(id = R.drawable.profile_picture),
        contentDescription = "Profile description",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(200.dp)
    )
}

@Composable
fun ContactInfo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
    ) {
        Text(text = "+7 (912) 462 78 50", fontSize = 16.sp)
        Text(text = "mechkov.igor04@gmail.com", fontSize = 16.sp)
        Text(text = "github.com/WolfOfBad", fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCardScreen()
}