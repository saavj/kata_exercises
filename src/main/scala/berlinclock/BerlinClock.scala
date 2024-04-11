package berlinclock

object BerlinClock {

  def convertToBerlinTime(str: String): String = ???

  def bottomMinutes(i: Int): String = ???

  def topMinutes(i: Int): String = "OOOOOOOOOOO"

  def bottomHours(i: Int): String = {
    if (i > 24) "Not a valid time"
    else
      i % 5 match {
      case 0 => "OOOO"
      case 1 => "ROOO"
      case 2 => "RROO"
      case 3 => "RRRO"
      case 4 => "RRRR"
      case _ => "???"
    }
  }

  def topHours(i: Int): String = {
    if (i >= 0 && i <=4) "OOOO"
    else if (i >= 5 && i <=9) "ROOO"
    else if (i >= 10 && i <=14) "RROO"
    else if (i >= 15 && i <=19) "RRRO"
    else if (i >= 20 && i <= 24) "RRRR"
    else "Not a valid time"
  }

  def seconds(x: Int): String = {
    if (x % 2 == 0) "Y" else "O"
  }

}

/**
  * Hours 0, 1, 2, 3, 4 = OOOO
  * Hours 5, 6, 7, 8, 9 = ROOO
  */
