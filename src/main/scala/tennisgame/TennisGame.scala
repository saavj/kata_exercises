package tennisgame

import scala.collection.immutable.{AbstractMap, SeqMap, SortedMap}


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


class TennisGame(val game: Map[Player, Score]) {

  val score: (Score, Score) = (game.values.toList(0), game.values.toList(1))

  def winBall(player: Player): TennisGame = {
    // check whether both players have score forty
    val bothForty: Boolean = (game.values.toList == List(Forty, Forty))



    val currentScore = game.getOrElse(player, Love)

    val newScore = nextScoreNormal(player)

    // extract current game state


    val newScore = nextScoreNormal(player)

    val updatedGame  = bothForty match {
      case true => game + (player -> -)
    }

    val newTennisGame = new TennisGame(updatedGame)
    println(s"the current score is ${newTennisGame.score}")
    newTennisGame

  }
/*
  Expected :Map(Player("Adam", 0) -> Forty, Player("Bob", 0) -> Forty)
  Actual   :Map(Player("Adam", 0) -> Forty, Player("Bob", 0) -> Advantage)
   */

  def nextScoreNormal(player: Player): (Score, Player) = {
    val score = game.getOrElse(player,Love)
    score match {
      case Love => (Fifteen, player)
      case Fifteen => (Thirty, player)
      case Thirty => (Forty, player)
      case Forty => checkAdvantage(player) // Change this line
    }
  }

  //  (Forty, Advantage), player1 wins ->  (Forty, Forty)
  // (Forty, Advantage), player2 wins -> (Forty, Win)




  def checkAdvantage(playerWon: Player): (Score,Player)  = {
    val playerScores = game.values.toList

    playerScores match {
      case List(Forty, Advantage) if game.get(playerWon).contains(Forty) =>
        println(game)
        (Forty, game.keys.toList(1))
//      case List(aD, Advantage) if game.get(playerWon).contains(Forty) =>  (Forty: Score, game.keys.toList(1))
      case _ => ???

    }
  }


}

object TennisGame {
  def apply(player1: Player, player2: Player): TennisGame = {
    new TennisGame(Map(player1 -> Love, player2 -> Love))
  }
}