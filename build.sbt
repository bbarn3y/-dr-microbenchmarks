name := "dr-microbenchmarks"

version := "0.1"

scalaVersion := "2.13.6"

lazy val root = (project in file(".")).
	settings(
		libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % Test,
		libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.15.4" % "test",
		libraryDependencies += "com.google.guava" % "guava" % "19.0"
	)