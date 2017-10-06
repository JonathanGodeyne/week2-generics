package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class Team<T extends Player> {
	private String name;
	private int played=0;
	private int won = 0;
	private int lost = 0;
	private int tied = 0;
	private ArrayList<T> members = new ArrayList<T>();

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayed() {
		return played;
	}

	public void setPlayed(int played) {
		this.played = played;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getLost() {
		return lost;
	}

	public void setLost(int lost) {
		this.lost = lost;
	}

	public int getTied() {
		return tied;
	}

	public void setTied(int tied) {
		this.tied = tied;
	}

	public ArrayList<T> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<T> members) {
		this.members = members;
	}

	public void addPlayer(T player) {
		if(!members.contains(player)) {
		members.add(player);
		}
	}

	public int numberOfPlayers() {
		int result = members.size();
		return result;
	}

	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		if(ourScore>theirScore) {
			won++;
		}else if (ourScore==theirScore) {
			tied++;
		}else {
			lost++;
		}
		played++;
		
		if(opponent!=null) {
			opponent.matchResult(null, theirScore, ourScore);			
		}		
		
//		this.played++;
//		if(opponent !=null) {
//			opponent.setPlayed(getPlayed()+1);
//		}
//		
//		if (ourScore == theirScore) {
//			this.tied++;
//			if(opponent !=null) {
//				opponent.tied++;
//			}
//		} else {
//			if (ourScore > theirScore) {
//				this.won++;
//				if(opponent !=null) {
//					opponent.lost++;
//				}
//			} else {
//				this.lost++;
//				if(opponent !=null) {
//					opponent.won++;
//				}
//			}
//		}
	}

	public int ranking() {
		int result;
		result = (this.getWon() * 3) + this.getTied();
		return result;
	}

}
