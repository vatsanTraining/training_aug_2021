package com.training.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.training.exceptions.TeamNotFormedException;
import com.training.ifaces.TeamCreation;
import com.training.model.Player;

public class FootBallTeamCreation implements TeamCreation {

	
	private HashSet<Player> playerList;
	
	
	private  int maxDefenders ;
	private  int  maxMidfield ;
	private int maxForward ;
	private int maxGoalKeeper ;

	private int total =0;
	
	
	
	public FootBallTeamCreation(int maxDefenders, int maxMidfield, int maxForward, int maxGoalKeeper) {
		super();
		
		playerList = new HashSet<>();

		this.maxDefenders = maxDefenders;
		this.maxMidfield = maxMidfield;
		this.maxForward = maxForward;
		this.maxGoalKeeper = maxGoalKeeper;
		
		
	}

	public FootBallTeamCreation() {
		super();
	
		playerList = new HashSet<>();
	}

	@Override
	public boolean add(Player entity) {
		return playerList.add(entity);
		
	}

	@Override
	public HashSet<Player> formTeam() throws TeamNotFormedException {
		
		HashSet<Player> selectedTeam = new HashSet<>();
		
		 int defenders = 0;
		 int  midfield = 0;
		 int forward = 0;
		int goalKeeper = 0;

		total = this.maxDefenders+ this.maxForward+this.maxGoalKeeper+this.maxMidfield;
		
		if(playerList.size()<total) {
			throw new TeamNotFormedException("Team cannot be formed -Need minimum 11 Players");
		} 
		
			
			boolean result =checkByCategory();
			
			 if(!result) {
				  throw new TeamNotFormedException("Team cannot be formed -Less Number of Players in One Category");
			 }
			 
			 
			 for (Player eachPlayer : playerList) {
					
					
					String category = eachPlayer.getCategory().toLowerCase();
					
					if (category.equals("defender") && defenders < maxDefenders) {
						
						selectedTeam.add(eachPlayer);
						defenders++;
					}
					
                    if (category.equals("midfield") && midfield < maxMidfield) {
						
						selectedTeam.add(eachPlayer);
						midfield++;
					}
                    
                    if (category.equals("forward") && forward < maxForward) {
						
						selectedTeam.add(eachPlayer);
						forward++;
					}

                   if (category.equals("goalkeeper") && goalKeeper < maxGoalKeeper) {
						
						selectedTeam.add(eachPlayer);
						goalKeeper++;
					}
					
	}
			 
				return selectedTeam;

	}

	
	private  boolean  checkByCategory() {
		
		boolean result = false;
		
    	int defenderCount=0;
    	int forwardCount=0;
	     int goalKeeperCount=0;
		int midFielderCount=0;



		for (Player eachPlayer : playerList) {
			
			
			String key = eachPlayer.getCategory().toLowerCase();
			
			switch (key) {
			case "defender":
				defenderCount++;
				break;
			case "forward":
			     forwardCount++;
                 break;
			case "goalkeeper":
				goalKeeperCount++;
			     break;
			case "midfield":
				midFielderCount++;
				 break;
				
			
			}
			
		}
		
		if (defenderCount <= maxDefenders || midFielderCount <=maxMidfield || forwardCount <= maxForward ||  goalKeeperCount <= maxGoalKeeper) {
			result =true;
		}

		return result ;
		
	}


	public Set<Player> getPlayerList() {
		return playerList;
	}

}
