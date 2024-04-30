package tennisgame



//ToDo Default games -> Multiple classes, different apply methods one
// takes a List[Players], List[Points]
// ToDo Games for an 'in-progress' game

case class Player(name: String)
case class Score(points: String)

case class TennisGame(game: Map[Player, Score])


