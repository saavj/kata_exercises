package berlinclock

import org.scalatest.{FlatSpec, Matchers}

class BerlinClockTest extends FlatSpec with Matchers {

  /**
    * Hi!
    *
    * The aim of the game is to uncomment one test at a time, one line at a time, and get the tests to pass :)
    *
    * Good luck!!
    *
    */

  "Yellow lamp" should "blink on/off every two seconds" in {
    BerlinClock.seconds(0) shouldBe ("Y")
  }


}