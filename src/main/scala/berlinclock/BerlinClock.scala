package berlinclock

object BerlinClock {

  def convertToBerlinTime(str: String): String = ???

  def bottomMinutes(i: Int): String = ???

  def topMinutes(i: Int): String = ???

  def bottomHours(i: Int): String = ???

  def topHours(leftSide: Int): String = {
    val rightSide = leftSide / 5
    rightSide match {
      case 0 => "OOOO"
      case 1 => "ROOO"
      case 2 => "RROO"

    }
  }


  /**
   *
   * 0hrs = 0 red lights => "0000"
   * 5hrs = 1 red light => "R000"
   * 13hrs = 2 red lights
   * 17hrs = 3 red lights
   * 23hrs = 4 red lights
   *
   */

  def seconds(x: Int): String = if (x%2 == 0) "Y" else "O"

}
