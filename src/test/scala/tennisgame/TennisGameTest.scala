package tennisgame

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TennisGameTest  extends AnyFlatSpec with should.Matchers {

  "Points" should "be accrued for each player in a Game" in {

    val player1 = Player("Shiva")
    val player2 = Player("Adonay")

    val players = Map(player1 -> Love, player2 -> Love)

    val game = new TennisGame(players)

    val t = game.winRound(player1)
//    t.game.find(player1) should be(Fifteen)

    //game.winRound(player1) should be(Thirty)

  }

  "Love" should "be description for score 0" in {

  }

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

  }



}