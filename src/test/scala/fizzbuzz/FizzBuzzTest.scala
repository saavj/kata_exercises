package fizzbuzz

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzTest extends FlatSpec with Matchers {

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
//    FizzBuzz.play(6) shouldBe "fizz"
  }
//
//  "FizzBuzz" should "return the word buzz if the number is divisible by 5" in {
//    FizzBuzz.play(5) shouldBe "buzz"
//    FizzBuzz.play(10) shouldBe "buzz"
//  }
//
//  "FizzBuzz" should "return the word fizzbuzz if the number is divisible by 15" in {
//    FizzBuzz.play(15) shouldBe "fizzbuzz"
//    FizzBuzz.play(30) shouldBe "fizzbuzz"
//  }
//
//  "FizzBuzz" should "return the number if else" in {
//    FizzBuzz.play(7) shouldBe "7"
//    FizzBuzz.play(11) shouldBe "11"
//  }

}