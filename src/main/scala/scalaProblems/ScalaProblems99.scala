package scalaProblems

object ScalaProblems99 {

  def nth(pos: Int, list: List[Int]): Option[Int] = {
    (list, pos) match {
      case (Nil, _) => None
      case (head :: _, 0) => Some(head)
      case (head :: tail, pos) => nth(pos -1, tail)
    }
  }




  def last(list: List[Int]): Option[Int] =
    list match {
      case head :: last :: Nil => Some(last)
      case l :: Nil => Some(l)
      case Nil => None
      case _ => last(list.tail)
    }
}