package quine

import java.io.File

import scala.io.Source
import scala.compiletime._

class QuineSuite extends munit.FunSuite {
  test("quine") {
    assertEquals(constValue[quine.Quine], Source.fromFile(new File("src/main/scala/quine.scala")).mkString)
  }
}
