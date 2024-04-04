package fizzbuzz

object FizzBuzz {

  def play(number: Int): String = {
    if (number % 15 == 0) "fizzbuzz"
    else if (number % 5 == 0) "buzz"
    else if (number % 3 == 0) "fizz"
    else number.toString
  }
}
