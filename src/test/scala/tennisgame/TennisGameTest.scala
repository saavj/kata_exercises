package tennisgame

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

import scala.Tuple2
import scala.annotation.unused


class TennisGameTest  extends AnyFlatSpec with should.Matchers {

  "Points" should "be accrued for each player in a Game" in {

    val player1 = Player("Shiva")
    val player2 = Player("Adonay")

    val game = TennisGame(player1,player2)


    game.winBall(player2).score should be (Love, Fifteen)

    game.winBall(player1).winBall(player2).winBall(player1).score should be (Thirty,Fifteen)

  }

  "Love" should "be description for score 0" in {

    Love.value should be(0)

  }

  "given an existing game (Love, Love) when winBall" should "return a tennis game (Thirty, Love) when player1 wins a game" in
 {

    //Arrange -
    val initialGame = TennisGame.apply(player1 = Player("Nadal"), player2 = Player("Simon")) // this is equivalent to new TennisGame(Map(Player("Nadal") -> Love, Player("Simon") -> Love))

    //Act
    val updatedGame = initialGame.winBall(Player("Nadal"))

    //Assert
    updatedGame.game should be(Map(Player("Nadal") -> Fifteen, Player("Simon") -> Love))
  }

  "given an existing game where player1 is FortyFive, player 2 is not FortyFive " +
    "when player1 winBall " should "player1"





  "Fifteen" should "be description for score 1" in {
  }

  "Thirty" should "be description for score 2" in {
  }

  "Forty" should "be description for score 3" in {
  }

  "Advantage" should "describe when least three points have been scored by each side and a player has one more point than his opponent" in {
  }

  "Deuce" should "be description when at least three points have been scored by each player and the scores are equal" in {

  }

  "Game" should "be won by the first player to have won at least four points in total and with at least two points more than the opponent" in {
      //Arrange
      val player1 = Player("Adonay")
      val player2 = Player("Shiva")
      val tennisGame = TennisGame(player1,player2)
      val simulateGame = tennisGame
        .winBall(player1)
        .winBall(player2)
        .winBall(player1)
        .winBall(player2)
    
      //Act
      val result = (simulateGame.score)._2

      //Assert
      result should be(Win)
  }
}
