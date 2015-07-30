name := "storm_start_template"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "net.liftweb" % "lift-json_2.10" % "3.0-M1" withSources() withJavadoc()

libraryDependencies += "com.typesafe.slick" % "slick-codegen_2.10" % "2.1.0" withSources() withJavadoc()

libraryDependencies += "com.typesafe.slick" % "slick_2.10" % "2.1.0" withSources() withJavadoc()

libraryDependencies += "org.apache.storm" % "storm-core" % "0.9.5" withSources() withJavadoc()

fork := true

resolvers += "clojars" at "https://clojars.org/repo"