name := "root"

lazy val bigIntegerTest = crossProject.in(file(".")).settings(
  name := "bigIntegerTest",
  scalaVersion := "2.11.7",
  libraryDependencies += "org.scalacheck" %%% "scalacheck" % "1.12.5"
)

lazy val bigIntegerTestJVM = bigIntegerTest.jvm
lazy val bigIntegerTestJS = bigIntegerTest.js
