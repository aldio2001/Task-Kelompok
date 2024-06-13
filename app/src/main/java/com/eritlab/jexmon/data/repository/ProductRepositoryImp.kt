package com.eritlab.jexmon.data.repository

import com.eritlab.jexmon.data.demo_db.DemoDB
import com.eritlab.jexmon.domain.model.ProductModel
import com.eritlab.jexmon.domain.repository.ProductRepository
import javax.inject.Inject

// Kelas ProductRepositoryImp mengimplementasikan antarmuka ProductRepository.
// Anotasi @Inject memungkinkan kelas ini diinisialisasi oleh Dagger Hilt untuk Dependency Injection.
class ProductRepositoryImp @Inject constructor(
    // Dependency Injection dari DemoDB yang disediakan melalui konstruktor.
    private val demoDB: DemoDB
) : ProductRepository {

    // Mengoverride fungsi getProduct dari antarmuka ProductRepository.
    // Fungsi ini berjalan secara asynchronous (ditandai dengan suspend) dan mengembalikan daftar produk.
    override suspend fun getProduct(): List<ProductModel> {
        // Mengambil daftar produk dari DemoDB.
        return demoDB.getProduct()
    }

    // Mengoverride fungsi getProductDetail dari antarmuka ProductRepository.
    // Fungsi ini juga berjalan secara asynchronous dan mengembalikan detail produk berdasarkan ID.
    override suspend fun getProductDetail(id: Int): ProductModel {
        // Mengambil detail produk dari DemoDB berdasarkan ID.
        // Karena indeks dalam daftar dimulai dari 0, dikurangkan 1 dari ID untuk mendapatkan indeks yang benar.
        return demoDB.getProduct()[id-1]
    }
}
