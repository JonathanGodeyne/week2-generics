package be.pxl.generics.opdracht1;

public class TestClass {

	public static void main(String[] args) {
	BaseballPlayer baseBallplayer1 = new BaseballPlayer("baseball1");
	BaseballPlayer baseBallplayer2 = new BaseballPlayer("baseball2");
	BaseballPlayer baseBallplayer3 = new BaseballPlayer("baseball3");
	
	SoccerPlayer soccerPlayer1 = new SoccerPlayer("soccer1");
	SoccerPlayer soccerPlayer2 = new SoccerPlayer("soccer2");
	SoccerPlayer soccerPlayer3 = new SoccerPlayer("soccer3");
	
	VolleybalPlayer volleyBallPlayer1 = new VolleybalPlayer("volley1");
	VolleybalPlayer volleyBallPlayer2 = new VolleybalPlayer("volley2");
	VolleybalPlayer volleyBallPlayer3 = new VolleybalPlayer("volley3");
	
	Team<BaseballPlayer> teamBase = new Team<BaseballPlayer>("teamBaseBall");
	//teamBase.addPlayer(soccerPlayer3);zou niet morgen werken!
	
	
	

	}

}
