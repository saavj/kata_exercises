package berlinclock

object BerlinClock {

  def convertToBerlinTime(str: String): String = ???

  def bottomMinutes(i: Int): String = ???

  def topMinutes(i: Int): String = ???

  def bottomHours(i: Int): String = ???

  def topHours(i: Int): String =
    if (i >= 0 && i <=4) "OOOO"
    else if (i >= 5 && i <=9) "ROOO"
    else "RROO"

  def seconds(x: Int): String = {
    if (x % 2 == 0) "Y" else "O"
  }

}

/**
  * Hours 0, 1, 2, 3, 4 = OOOO
  * Hours 5, 6, 7, 8, 9 = ROOO
  */
