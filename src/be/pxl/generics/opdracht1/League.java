package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class League<T extends Player> {
	private ArrayList<Team> league;

	public League() {		
	}
	
	public void addTeam(Team team){
		league.add(team);
	}
	
	public void printTeams() {
		for (Team team : league) {
			System.out.println(team+" "+team.ranking());
			
		}
	}

}
