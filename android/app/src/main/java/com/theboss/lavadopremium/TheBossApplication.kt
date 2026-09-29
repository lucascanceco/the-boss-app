package com.theboss.lavadopremium

import android.app.Application
import com.google.firebase.FirebaseApp
import com.theboss.lavadopremium.data.local.TheBossDatabase
import com.theboss.lavadopremium.data.local.UserPreferencesRepository
import com.theboss.lavadopremium.data.remote.FirebaseDataSource
import com.theboss.lavadopremium.data.repository.TheBossRepository

class TheBossApplication : Application() {

    lateinit var database: TheBossDatabase
        private set

    lateinit var userPreferences: UserPreferencesRepository
        private set

    lateinit var firebaseDataSource: FirebaseDataSource
        private set

    lateinit var repository: TheBossRepository
        private set

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)

        database = TheBossDatabase.getDatabase(this)
        userPreferences = UserPreferencesRepository(this)
        firebaseDataSource = FirebaseDataSource()

        repository = TheBossRepository(
            context = this,
            database = database,
            firebaseDataSource = firebaseDataSource,
            userPrefs = userPreferences
        )
    }
}
