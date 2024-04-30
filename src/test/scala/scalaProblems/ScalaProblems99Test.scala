package scalaProblems

import org.scalatest._
import org.scalatest.flatspec._
import org.scalatest.matchers._
import collection.mutable.Stack

class ScalaProblems99Test extends AnyFlatSpec with should.Matchers {

  "scalaProblems" should "find last number in list" in {
    ScalaProblems99.last(List(1, 1, 2, 3, 5, 8)) shouldBe Some(8)
    ScalaProblems99.last(Nil) shouldBe None
    ScalaProblems99.last(List(1)) shouldBe Some(1)
  }

  it should "find the nth element" in {
    ScalaProblems99.nth(2, List(1, 1, 2, 3, 5, 8)) shouldBe Some(2)
  }

}
