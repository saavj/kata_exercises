package berlinclock

object BerlinClock {
  def convertToBerlinTime(timestamp: String): Array[String] = {
    val indexArray: Array[String] = timestamp.split(':')

    // ToDo Flatmap in the indexArray, pattern match against (element, index) ???

      val hours  = Array(topHours(indexArray(0).toInt),bottomHours(indexArray(0).toInt))
      val minutes  = Array(topMinutes(indexArray(1).toInt),bottomMinutes(indexArray(1).toInt))
      val secs = Array(seconds(indexArray(2).toInt))

      secs ++ hours ++ minutes
    }



  def seconds(number: Int): String = (number % 2) match {
    case 0 => "Y"
    case 1 => "O"
  }

  def topHours(number: Int): String = ((number) / 5) match {
    case 0 => "OOOO"
    case 1 => "ROOO"
    case 2 => "RROO"
    case 3 => "RRRO"
    case _ => "RRRR"
  }

  def bottomHours(number: Int): String = (number % 5) match {
    case 0 => "OOOO"
    case 1 => "ROOO"
    case 2 => "RROO"
    case 3 => "RRRO"
    case _ => "RRRR"
  }

  def topMinutes(number: Int): String = {
    // how many 15s in number
    val noYYR: String = {
      val quotient: Int = number / 15
      "YYR" * quotient
    }


    // how many remaining 5s
    val remainder = (number % 15)
    val noY: String = (remainder / 5) match {
      case 0 => ""
      case 1 => "Y"
      case 2 => "YY"
    }
    val padding = "O" * (11 - (noYYR + noY).length)

    noYYR + noY + padding
    // pad the rest of the string with Os..
    // for length 11
  }

  def bottomMinutes(number: Int): String = {
    val remainder = number - (number/5)*5 // remainder left after
    remainder match {
      case 0 => "OOOO"
      case 1 => "Y000"
      case 2 => "YYOO"
      case 3 => "YYYO"
      case 4 => "YYYY"
    }
}
}
