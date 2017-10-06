package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class League<T extends Player> {
	private ArrayList<Team<T>> league;

	public League() {		
	}
	
	public void addTeam(Team<T> team){
		league.add(team);
	}
	
	public void printTeams() {
		for (Team<T> team : league) {
			System.out.println(team+" "+team.ranking());
			
		}
	}

}
