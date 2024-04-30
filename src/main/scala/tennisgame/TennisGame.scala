package tennisgame

case class Player(name: String)
case class Score(points: String)

class TennisGame(game: Map[Player, Score])



object Scores extends Enumeration {
  type Score = Value

  val Love, Fifteen, Thirty, Forty, Deuce, Adv = Value
}