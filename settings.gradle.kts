pluginManagement {
    buildscript {
        repositories {
            google()
            mavenCentral()
        }
        dependencies {
            classpath("com.android.tools:r8:8.2.33")
        }
    }
}

include(":core")
include(":aiostreams")