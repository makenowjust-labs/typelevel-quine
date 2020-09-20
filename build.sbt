Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / scalaVersion := "0.27.0-RC-1"

lazy val root = project
  .in(file("."))
  .settings(
    organization := "codes.quine.labo",
    name := "typelevel-quine",
    version := "0.1.0-SNAPSHOT",
    console / initialCommands := """
      |import codes.quine.labo.typelevel.quine._
      """.stripMargin,
  )
