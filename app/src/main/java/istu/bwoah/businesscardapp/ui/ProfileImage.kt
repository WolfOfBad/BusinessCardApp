package istu.bwoah.businesscardapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import istu.bwoah.businesscardapp.R

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