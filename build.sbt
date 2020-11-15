Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / scalaVersion := "0.27.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    organization := "codes.quine.labo",
    name := "typelevel-quine",
    version := "0.1.0-SNAPSHOT",
    console / initialCommands := """
      |import scala.compiletime._
      |
      |import quine._
      """.stripMargin,
    // Settings for test:
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.17",
    testFrameworks += new TestFramework("munit.Framework")
  )
