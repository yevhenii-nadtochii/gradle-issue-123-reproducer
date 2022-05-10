rootProject.name = "reproducer-project"
include("moduleA")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            val guava = "31.1-jre"
            library("guava", "com.google.guava:guava:${guava}")
            library("guava-testlib", "com.google.guava:guava-testlib:${guava}")
        }
    }
}
