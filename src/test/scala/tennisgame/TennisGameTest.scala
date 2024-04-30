package tennisgame

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

<<<<<<< HEAD
class TennisGameTest extends AnyFlatSpec with should.Matchers {

  "Points" can "be added to each player" in {
    val victor = Player("Victor")
    val sarah = Player("Sarah")
    val players = Map(victor -> Points(0), sarah -> Points(0))

    val game = new TennisGame(players) // to default to 0 points, look into multiple apply methods

    val emptyGame = game
    val firstRound: TennisGame = game.win(victor)
    firstRound.win(victor).win(sarah).win(victor).score should be List[Player, Points]
  }

=======
class TennisGameTest  extends AnyFlatSpec with should.Matchers {

  "Points" should "be accrued for each player in a Game" in {

    val player1 = Player("Shiva")
    val player2 = Player("Adonay")

    val game = new TennisGame()

    game.winBall().score should be Score(0, 1)

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



>>>>>>> master
}
