package berlinclock

object BerlinClock {

  def convertToBerlinTime(str: String): String = ???

  def bottomMinutes(i: Int): String = ???

  def topMinutes(i: Int): String =
    "XX" + helper(15, i) + "XX" + helper(30, i) + "xx" + helper(45, i)

  def helper(threshold: Int, i: Int) =
    if (i < threshold) "O" else "R"

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

  def seconds(x: Int): String = if (x%2 == 0) "Y" else "O"

}
