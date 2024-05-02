package tennisgame

case class Player(name: String, score: Int) {

  def incrementScore = {
    this.copy(score = score + 15)
  }
}

class TennisGame(player1: Player, player2: Player) {


}