package com.eritlab.jexmon.utils

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesManager(context: Context) {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sharedPreferences.edit()

    var firstName: String?
        get() = sharedPreferences.getString(KEY_FIRST_NAME, null)
        set(value) {
            editor.putString(KEY_FIRST_NAME, value).apply()
        }

    var lastName: String?
        get() = sharedPreferences.getString(KEY_LAST_NAME, null)
        set(value) {
            editor.putString(KEY_LAST_NAME, value).apply()
        }

    var phoneNumber: String?
        get() = sharedPreferences.getString(KEY_PHONE_NUMBER, null)
        set(value) {
            editor.putString(KEY_PHONE_NUMBER, value).apply()
        }

    var address: String?
        get() = sharedPreferences.getString(KEY_ADDRESS, null)
        set(value) {
            editor.putString(KEY_ADDRESS, value).apply()
        }

    var email: String?
        get() = sharedPreferences.getString(KEY_EMAIL, null)
        set(value) {
            editor.putString(KEY_EMAIL, value).apply()
        }

    var password: String?
        get() = sharedPreferences.getString(KEY_PASSWORD, null)
        set(value) {
            editor.putString(KEY_PASSWORD, value).apply()
        }

    companion object {
        private const val PREFS_NAME = "user_prefs"
        private const val KEY_FIRST_NAME = "first_name"
        private const val KEY_LAST_NAME = "last_name"
        private const val KEY_PHONE_NUMBER = "phone_number"
        private const val KEY_ADDRESS = "address"
        private const val KEY_EMAIL = "email"
        private const val KEY_PASSWORD = "password"

        @Volatile
        private var INSTANCE: SharedPreferencesManager? = null

        fun getInstance(context: Context): SharedPreferencesManager {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: SharedPreferencesManager(context).also { INSTANCE = it }
            }
        }
    }
}
