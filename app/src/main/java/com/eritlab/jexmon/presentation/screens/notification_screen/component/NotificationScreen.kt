package com.eritlab.jexmon.presentation.screens.notification_screen.component

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun NotificationScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Notification Screen")

        Button(onClick = {
            // Aksi yang dilakukan saat tombol diklik
            Toast.makeText(context, "Button clicked", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Alarm manager")
        }
    }
}
