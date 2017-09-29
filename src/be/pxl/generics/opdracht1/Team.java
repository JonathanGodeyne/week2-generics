package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class Team<T> {
	private String name;
	private int played;
	private int won;
	private int lost;
	private int tied;
	private ArrayList<T> members;

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
		members.add(player);
	}

	public int numberOfPlayers() {
		int result = members.size();
		return result;
	}

	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		if (ourScore == theirScore && ourScore != 0 && theirScore != 0) {
			this.tied++;
			opponent.tied++;
		} else {
			if (ourScore > theirScore) {
				this.won++;
				opponent.lost++;
			} else {
				this.lost++;
				opponent.won++;
			}
		}
	}

	public int ranking() {
		int result;
		result = (this.getWon() * 3) + this.getTied();
		return result;
	}

}
