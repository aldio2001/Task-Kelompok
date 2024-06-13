package com.eritlab.jexmon.common

// Sealed class Resource digunakan untuk merepresentasikan status data dalam suatu operasi.
// Status tersebut bisa berupa Loading, Success, atau Error.
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    // Class Loading digunakan untuk menandakan bahwa operasi sedang berjalan.
    // Biasanya digunakan untuk menampilkan indikator loading kepada pengguna.
    class Loading<T> : Resource<T>()

    // Class Success digunakan untuk menandakan bahwa operasi telah berhasil.
    // Memiliki properti 'data' yang berisi hasil dari operasi tersebut.
    class Success<T>(data: T? = null) : Resource<T>(data = data)

    // Class Error digunakan untuk menandakan bahwa operasi gagal.
    // Memiliki properti 'message' yang berisi pesan kesalahan.
    class Error<T>(message: String? = null) : Resource<T>(message = message)
}
