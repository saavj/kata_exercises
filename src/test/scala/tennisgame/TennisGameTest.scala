package tennisgame

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

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

}
