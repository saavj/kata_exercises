package fizzbuzz

object FizzBuzz {
  def getResult(i: Int) = "1"


  def play(number: Int): String = number match {
    case x if (x%3==0 && x%5==0) => "fizzbuzz"
    case x if x%3==0 =>"fizz"
    case x if x%5==0 => "buzz"
    case x => x.toString
  }
  
}
