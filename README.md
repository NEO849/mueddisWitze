### mueddi´s Witze

## I. Navigation einrichten:
    - build.gradle(:app)
        +     plugins:          id("androidx.navigation.safeargs.kotlin")
        +     dependencies:     val nav_version = "2.7.5"
                                // Java language implementation
                                implementation("androidx.navigation:navigation-fragment:$nav_version")
                                implementation("androidx.navigation:navigation-ui:$nav_version")
                                // Kotlin, notwendig, um Fragmente und das Navigation UI zu unterstützen und Erweiterungen für Navigationscode 
                                implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
                                implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
                                // Feature module Support,  für die Unterstützung von Feature-Modulen
                                implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")
                                // Testing Navigation
                                androidTestImplementation("androidx.navigation:navigation-testing:$nav_version")
                                // Jetpack Compose Integration
                                implementation("androidx.navigation:navigation-compose:$nav_version")

    - build.gradle(mWitze) Ermöglicht das sichere Übergeben von Navigationsargumenten zwischen Fragmenten, hilft den Code sauber und wartbar zu halten
        + Safe Args hinzufügen: buildscript {
                                    repositories {
                                        google()
                                    }
                                    dependencies {
                                        val nav_version = "2.7.5"
                                        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
                                    }
                                }
