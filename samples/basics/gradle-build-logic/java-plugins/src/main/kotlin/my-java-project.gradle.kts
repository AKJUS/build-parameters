plugins {
    id("java-library")
    id("my-build-params")
}

val host = buildParameters.dbHost
val tomcatHome = buildParameters.tomcatHome
