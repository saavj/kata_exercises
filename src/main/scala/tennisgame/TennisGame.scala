package tennisgame

case class Player(name: String)
//case class Score(points: String)


val m = Map("zebra" -> "Stripes", "lion" -> "mane")





class TennisGame(val game: Map[Player, Score]) {

  def winRound(player1: Player): TennisGame =
    new TennisGame(game + (player1 -> Fifteen))
}

sealed trait Score {
}
case object Love extends Score {
  val value = 0
}
case object Fifteen extends Score{
  val value = 1
}
case object Thirty extends Score {
  val value = 2
}
case object Forty extends Score {
  val value = 3
}