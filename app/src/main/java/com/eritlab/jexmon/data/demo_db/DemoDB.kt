package com.eritlab.jexmon.data.demo_db

import androidx.compose.ui.graphics.Color
import com.eritlab.jexmon.R
import com.eritlab.jexmon.domain.model.ProductModel
import javax.inject.Inject

//BY ALDIO YOHANES
// Kelas DemoDB digunakan sebagai database demo yang menyimpan data produk secara statis.
// Anotasi @Inject memungkinkan kelas ini diinisialisasi oleh Dagger Hilt untuk Dependency Injection.
class DemoDB @Inject constructor() {

    // Variabel description digunakan untuk menyimpan deskripsi produk yang akan digunakan berulang kali.
    private val description = "Pengontrol Nirkabel untuk PS4™ memberi Anda apa yang Anda inginkan dalam permainan Anda mulai dari kontrol permainan yang lebih presisi hingga berbagi …"

    // Fungsi getProduct() mengembalikan daftar produk dalam bentuk List<ProductModel>.
    fun getProduct(): List<ProductModel> {
        return listOf(
            // Produk pertama
            ProductModel(
                id = 1,
                title = "Wireless Controller for PS4™",
                description = description,
                images = listOf(
                    R.drawable.ps4_console_white_1,
                    R.drawable.ps4_console_white_2,
                    R.drawable.ps4_console_white_3,
                    R.drawable.ps4_console_white_4
                ),
                colors = listOf(
                    Color(0xFFF6625E),
                    Color(0xFF836DB8),
                    Color(0xFFDECB9C),
                    Color.White
                ),
                rating = 4.8,
                price = 79.99,
                isFavourite = true,
                isPopular = true
            ),

            // Produk kedua
            ProductModel(
                id = 2,
                title = "Nike Sport White - Celana Pria",
                description = description,
                images = listOf(
                    R.drawable.image_popular_product_2
                ),
                colors = listOf(
                    Color(0xFFF6625E),
                    Color(0xFF836DB8),
                    Color(0xFFDECB9C),
                    Color.White
                ),
                rating = 4.1,
                price = 49.99,
                isFavourite = true,
                isPopular = true
            ),

            // Produk ketiga
            ProductModel(
                id = 3,
                title = "Sarung Tangan- Polygon",
                description = description,
                images = listOf(
                    R.drawable.glove
                ),
                colors = listOf(
                    Color(0xFFF6625E),
                    Color(0xFF836DB8),
                    Color(0xFFDECB9C),
                    Color.White
                ),
                rating = 4.1,
                price = 36.55,
                isFavourite = true,
                isPopular = true
            ),

            // Produk keempat
            ProductModel(
                id = 4,
                title = "Sarung Tangan - Polygon",
                description = description,
                images = listOf(
                    R.drawable.wireless_headset
                ),
                colors = listOf(
                    Color(0xFFF6625E),
                    Color(0xFF836DB8),
                    Color(0xFFDECB9C),
                    Color.White
                ),
                rating = 4.1,
                price = 19.99,
                isFavourite = true,
                isPopular = true
            )
        )
    }
}
