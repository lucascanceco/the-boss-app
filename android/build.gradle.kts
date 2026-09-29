plugins {
    // Versión compatible con tu entorno Android Studio / Nube
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    
    // Este es el plugin exacto que te pide tu captura de Firebase
    id("com.google.gms.google-services") version "4.5.0" apply false
    
    // Plugin necesario para compilar la base de datos Room
    id("com.google.devtools.ksp") version "1.9.22-1.0.17" apply false
}
