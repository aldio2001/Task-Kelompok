package com.eritlab.jexmon.presentation.screens.profile_screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.eritlab.jexmon.presentation.common.component.DefaultBackArrow
import com.eritlab.jexmon.presentation.ui.theme.TextColor
import com.eritlab.jexmon.R
import com.eritlab.jexmon.presentation.ui.theme.PrimaryColor
import com.eritlab.jexmon.utils.SharedPreferencesManager

@Composable
fun ProfileScreen(
    onBackBtnClick: () -> Unit
) {
    val context = LocalContext.current
    val sharedPreferencesManager = remember {
        SharedPreferencesManager.getInstance(context)
    }

    val firstName = sharedPreferencesManager.firstName ?: ""
    val lastName = sharedPreferencesManager.lastName ?: ""
    val email = sharedPreferencesManager.email ?: ""
    val fullName = "$firstName $lastName"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(0.5f)) {
                DefaultBackArrow {
                    onBackBtnClick()
                }
            }
            Box(modifier = Modifier.weight(0.7f)) {
                Text(
                    text = "Profile",
                    color = MaterialTheme.colors.TextColor,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            val (image, cameraIcon) = createRefs()
            Image(
                painter = painterResource(id = R.drawable.il1),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .clip(CircleShape)
                    .constrainAs(image) {
                        linkTo(start = parent.start, end = parent.end)
                    }
            )
            Box(contentAlignment = Alignment.Center, modifier = Modifier.constrainAs(cameraIcon) {
                bottom.linkTo(image.bottom)
                end.linkTo(image.end)

            }) {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.camera_icon),
                        contentDescription = "Change Picture",
                        modifier = Modifier.background(Color.LightGray)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = fullName,
                color = MaterialTheme.colors.onBackground,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(
                text = email,
                color = MaterialTheme.colors.TextColor,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)

                .background(Color(0x8DB3B0B0), shape = RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp))
                .clickable {

                }
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.user_icon),
                contentDescription = null,
                modifier = Modifier.weight(0.05f), tint = MaterialTheme.colors.PrimaryColor
            )
            Text("Profile Picture", modifier = Modifier.weight(0.2f))
            Icon(
                painter = painterResource(id = R.drawable.arrow_right),
                contentDescription = null,
                modifier = Modifier.weight(0.05f),
                tint = MaterialTheme.colors.TextColor
            )
        }

        Spacer(modifier = Modifier.height(15.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)

                .background(Color(0x8DB3B0B0), shape = RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp))
                .clickable {

                }
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.bell),
                contentDescription = null,
                modifier = Modifier.weight(0.05f), tint = MaterialTheme.colors.PrimaryColor
            )
            Text("Notification", modifier = Modifier.weight(0.2f))
            Icon(
                painter = painterResource(id = R.drawable.arrow_right),
                contentDescription = null,
                modifier = Modifier.weight(0.05f),
                tint = MaterialTheme.colors.TextColor
            )
        }


        Spacer(modifier = Modifier.height(15.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)

                .background(Color(0x8DB3B0B0), shape = RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp))
                .clickable {

                }
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.settings),
                contentDescription = null,
                modifier = Modifier.weight(0.05f), tint = MaterialTheme.colors.PrimaryColor
            )
            Text("Settings", modifier = Modifier.weight(0.2f))
            Icon(
                painter = painterResource(id = R.drawable.arrow_right),
                contentDescription = null,
                modifier = Modifier.weight(0.05f),
                tint = MaterialTheme.colors.TextColor
            )
        }


        Spacer(modifier = Modifier.height(15.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)

                .background(Color(0x8DB3B0B0), shape = RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp))
                .clickable {

                }
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.question_mark),
                contentDescription = null,
                modifier = Modifier.weight(0.05f), tint = MaterialTheme.colors.PrimaryColor
            )
            Text("Help Center", modifier = Modifier.weight(0.2f))
            Icon(
                painter = painterResource(id = R.drawable.arrow_right),
                contentDescription = null,
                modifier = Modifier.weight(0.05f),
                tint = MaterialTheme.colors.TextColor
            )
        }

        Spacer(modifier = Modifier.height(15.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(Color(0x8DB3B0B0), shape = RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp))
                .clickable {
                    sharedPreferencesManager.clear()
                }
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.log_out),
                contentDescription = null,
                modifier = Modifier.weight(0.05f), tint = MaterialTheme.colors.PrimaryColor
            )
            Text("Logout", modifier = Modifier.weight(0.2f))
            Icon(
                painter = painterResource(id = R.drawable.arrow_right),
                contentDescription = null,
                modifier = Modifier.weight(0.05f),
                tint = MaterialTheme.colors.TextColor
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen(
        onBackBtnClick = {}
    )
}

