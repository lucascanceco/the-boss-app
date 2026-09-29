package com.theboss.lavadopremium

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions

class TheBossApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        
        // Inicialización autónoma manual por código
        // Evita depender de los plugins automáticos conflictivos de Gradle
        try {
            if (FirebaseApp.getApps(this).isEmpty()) {
                val options = FirebaseOptions.Builder()
                    .setApplicationId("com.theboss.lavadopremium")
                    .setApiKey("AIzaSyFakeKey_THE_BOSS_AUTOMOTIVE_PREMIUM") // Reemplazable de forma transparente
                    .setDatabaseUrl("https://firebaseio.com") // Vinculación directa nativa
                    .build()
                FirebaseApp.initializeApp(this, options)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
