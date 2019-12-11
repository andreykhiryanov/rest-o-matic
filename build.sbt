name := """rest-o-matic"""
organization := "com.generation.brain"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean).disablePlugins(PlayFilters)

scalaVersion := "2.13.0"

libraryDependencies += guice
libraryDependencies += javaJdbc
libraryDependencies ++= Seq(evolutions, jdbc)
// https://mvnrepository.com/artifact/org.postgresql/postgresql
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.8"
libraryDependencies ++= Seq(
  "com.adrianhurt" %% "play-bootstrap" % "1.5.1-P27-B4"
)
