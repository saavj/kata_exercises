package berlinclock

object BerlinClock {

  def convertToBerlinTime(str: String): String = ???

  def bottomMinutes(i: Int): String = ???

  def topMinutes(i: Int): String = {
    // passed 15 minutes,
    //th
    // from 0 to 14, result(2) = "0"; result(5) = "0"; result(8) = "0"
    // from 15 to 29, result(2) = "R"; result(5) = "0"; result(8)= "0"
    /// from 30 to 44, result(2) = "R"; result(5) = "R"; result(8)= "0"
    /// from 45 to 59, result(2) = "R"; result(5) = "R"; result(8)= "R"

    i match {
      case i if i < 15 => "O"*11
      case i if i < 30 => "OOROOOOOOOO"
      case i if i < 45 => "XXRXXRXXOXX"
      case _ => "R"*11
    }
  }

  def bottomHours(i: Int): String = {
    val right = i % 5
    right match {
      case 0 => "OOOO"
      case 1 => "ROOO"
      case 2 => "RROO"
      case 3 => "RRRO"
      case 4 => "RRRR"
      case _ => "Yikes"
    }
  }

  def topHours(leftSide: Int): String = {
    val rightSide = leftSide / 5
    rightSide match {
      case 0 => "OOOO"
      case 1 => "ROOO"
      case 2 => "RROO"
      case 3 => "RRRO"
      case _ => "RRRR"

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
