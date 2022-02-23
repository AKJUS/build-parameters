plugins {
    id("de.jjohannes.gradle.build-parameters")
}

buildParameters {
    pluginId("de.benediktritter.build-params")
    parameter("dbHost") {
        defaultValue.set("localhost")
        description.set("Define the database host")
    }
    parameter("tomcatHome") {
        defaultValue.set("/tmp/tomcat")
        description.set("Define the installation directory of the local Tomcat server")
    }
}
