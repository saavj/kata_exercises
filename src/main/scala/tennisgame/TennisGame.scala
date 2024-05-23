package tennisgame


trait Player {
  def incrementScore: Player
}



case class Player1(name: String, score: Int, gamesWon:Int=0) extends Player {
  def incrementScore: Player1 = {
    score match {
      case 0 | 15 => this.copy(score = score + 15)
      case _ => this.copy(score = score + 10)
    }
  }
}
case class Player2(name: String, score: Int, gamesWon: Int=0) extends Player {
  def incrementScore: Player2 = {
    score match {
      case 0 | 15 => this.copy(score = score + 15)
      case _ => this.copy(score = score + 10)
    }
  }
}

case class TennisGame(player1: Player1, player2: Player2) {
  def winPoint(player: Player) = {
    player match {
      case _: Player1 => new TennisGame(player1.incrementScore, player2)
      case _: Player2 => new TennisGame(player1, player2.incrementScore)

    }
  }

  def announceScore: (Score,Score) =
    (player1.score, player2.score) match {
      case (0, 0) => "Love all"
      case (0, 15) => "Love Fifteen"
      case (15, 0) => "Fifteen Love"
      case (15, 15) => "Fifteen all"
      case (15, 30) => "Fifteen Thirty"
      case (30, 15) => "Thirty Fifteen"
      case (30, 0) => "Thirty Love"
      case (30, 30) => "Thirty all"
      case (0, 30) => "Love Thirty"
      case (40, 0) => "Forty Love"
      case (0, 40) => "Love Forty"
      case (30, 40) => "Thirty Forty"
      case (40, 30) => "Forty Thirty"
      case (p1score, p2score) if (p1score == p2score) && (p1score > 30 && p2score > 30) => "Deuce"
      case (p1score, p2score) if (p1score > p2score) && (p1score > 40 && p2score > 30) => "Advantage player 1"
      case (p1score, p2score) if (p1score < p2score) && (p1score > 30 && p2score > 40) => "Advantage player 2"
      case (p1score, p2score) if (p1score - p2score) == 20 => "Player 1 wins!"
      case (p1score, p2score) if (p2score - p1score) == 20 => "Player 2 wins!"
      case _ => "ERROR"
    }

}
