package tennisgame

case class Player(name: String, score: Int) {

  def incrementScore = {
    this.copy(score = score + 15)
  }
}

class TennisGame(player1: Player, player2: Player) {


}



//package tennisgame
//
//
//trait Player{
//  def incrementScore: Player
//}
//
//case class Player1(name: String, score: Int) extends Player {
//  def incrementScore: Player1 = {
//    this.copy(score = score + 15)
//  }
//}
//case class Player2(name: String, score: Int) extends Player {
//  def incrementScore: Player2 = {
//    this.copy(score = score + 15)
//  }
//}
//
//
//case class TennisGame(player1: Player1, player2: Player2) {
//  def winPoint(player: Player) = {
//    player match {
//      case _: Player1 => new TennisGame(player1.incrementScore, player2)
//      case _: Player2 => new TennisGame(player1, player2.incrementScore)
//
//    }
//  }
//}