package tennisgame


sealed trait Score{
  val value: Int
}
case object Love extends Score{
  val value = 0
}
case object Fifteen extends Score{
  val value = 1
}
case object Thirty extends Score {
  val value = 2
}
case object Forty extends Score{
  val value = 3
}

case object Advantage extends Score{
  val value = 4
}

case object Win extends Score{
  val value = 99
}

case class Player(name: String, noOfGames:Int=0)


class TennisGame(val game: Map[Player, Score]){

  val score: (Score,Score) = (game.values.toList(0), game.values.toList(1))

  def winBall(player: Player): TennisGame = {
    // check whether both players have score forty
    val currentScore = game.getOrElse(player,Love)

//    isForty match


    val newScore = nextScoreNormal(currentScore,player)
    val updatedGame  = game + (player-> newScore._1)

    val newTennisGame = new TennisGame(updatedGame)
    println(s"the current score is ${newTennisGame.score}")
    newTennisGame

  }
  def nextScoreNormal(score:Score, player:Player): (Score,Player) =
    score match {
      case Love => (Fifteen,player)
      case Fifteen => (Thirty,player)
      case Thirty => (Forty,player)
      case Forty => (Win, player)
    }


  //
  // (FortyFive, not FortyFive), player1 wins
  // player1 wins game

/// if two players have (FortyFive,FortyFive), player 1 wins point =>
  // (Advantage, FortyFive), player 1 wins point
  // player1 wins game
}

object TennisGame{
  def apply(player1: Player, player2: Player): TennisGame = {
    new TennisGame(Map(player1-> Love, player2 -> Love))
  }
}


