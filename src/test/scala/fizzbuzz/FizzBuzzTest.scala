package fizzbuzz

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class FizzBuzzTest extends AnyFlatSpec with should.Matchers {

  /**
    * Hi!
    *
    * The aim of the game is to uncomment one test at a time, one line at a time, and get the tests to pass :)
    *
    * Good luck!!
    *
    */

  "FizzBuzz" should "return the word fizz if the number is divisible by 3" in {
    FizzBuzz.play(3) shouldBe "fizz"
    FizzBuzz.play(6) shouldBe "fizz"
  }

  "FizzBuzz" should "return the word buzz if the number is divisible by 5" in {
    FizzBuzz.play(5) shouldBe "buzz"
    FizzBuzz.play(10) shouldBe "buzz"
  }

  "FizzBuzz" should "return the word fizzbuzz if the number is divisible by 15" in {
    FizzBuzz.play(15) shouldBe "fizzbuzz"
    FizzBuzz.play(30) shouldBe "fizzbuzz"
  }

  it should "return the same number if no other requirement is fulfilled" in {
    FizzBuzz.play(1) should be ("1")
    FizzBuzz.play(2) should be ("2")
    FizzBuzz.play(4) should be ("4")
  }

}