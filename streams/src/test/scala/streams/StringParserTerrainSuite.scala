package streams

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import common._

@RunWith(classOf[JUnitRunner])
class StringParserTerrainSuite extends FunSuite {

  trait LevelTest extends StringParserTerrain {
    val level =
     """------
       |--ST--
       |--oo--
       |--oo--
       |------""".stripMargin
  }

  test("StringParserTerrainSuite") {
    new LevelTest {
      assert(terrain(Pos(0, 0)) == false)
      assert(terrain(Pos(1, 1)) == false)
      assert(terrain(Pos(1, 2)) == true)
    }
  }

  test("findChar") {
    new LevelTest {
      assert(startPos == Pos(1, 2))
      assert(goal == Pos(1, 3))
    }
  }
}
