package tennisgame

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TennisGameTest  extends AnyFlatSpec with should.Matchers {

  "Points" should "be accrued for each player in a Game" in {
    val player1 = Player1("Ben", 0)
    val player2 = Player2("Archie", 0)

    val game = TennisGame(player1, player2)

    val rally1 = game.winPoint(player1)
    rally1.player1.score should be(15)
    rally1.player2.score should be(0)
  }

  "Love" should "be description for score 0" in {
    val player1 = Player1("Ben", 0)
    val player2 = Player2("Archie", 0)

    val game = TennisGame(player1, player2)

    game.announceScore should be("Love all")
  }

  "Fifteen" should "be description for score 15" in {
    val player1 = Player1("Adonay", 0)
    val player2 = Player2("Archie", 15)

    val game = TennisGame(player1, player2)

    game.announceScore should be("Love Fifteen")
    game.winPoint(player1).announceScore should be("Fifteen all")
  }

  "Thirty" should "be description for score 2" in {
    val player1 = Player1("Adonay", 30)
    val player2 = Player2("Archie", 0)

    val game = TennisGame(player1, player2)

    game.announceScore should be ("Thirty Love")
  }

  "Deuce" should "be the score after the player without advantage wins the next point" in {
    val player1 = Player1("Adonay", 40)
    val player2 = Player2("Archie", 40)

    val game = TennisGame(player1, player2)

    game.announceScore should be ("Deuce")
  }

  "Forty" should "be description for score 3" in {
  }

  "Thirty all" should "be description for score 30-30" in {
    val player1 = Player1("Adonay", 30)
    val player2 = Player2("Archie", 30)

    val game = TennisGame(player1, player2)

    game.announceScore should be ("Thirty all")
  }

  "Advantage" should "describe when least three points have been scored by each side and a player has one more point than his opponent" in {

  }

  "Deuce" should "be description when at least three points have been scored by each player and the scores are equal" in {

  }

  "Game" should "be won by the first player to have won at least four points in total and with at least two points more than the opponent" in {

  }
}
