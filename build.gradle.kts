allprojects {
    apply {
        from("${rootDir.resolve("versions.gradle.kts")}")
    }
}
