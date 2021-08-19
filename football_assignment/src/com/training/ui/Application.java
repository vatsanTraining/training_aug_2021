package com.training.ui;

import java.util.Set;

import com.training.exceptions.TeamNotFormedException;
import com.training.model.Player;
import com.training.services.FootBallTeamCreation;

public class Application {

	public static void main(String[] args) {

		
		Player ram = new Player("Ramesh", "defender", 2);
		Player shyam = new Player("Shyam", "defender", 2);
		Player shiv = new Player("Shiv", "forward", 3);
		Player naveen = new Player("naveen", "midfield", 2);
		Player raj = new Player("Rajesh", "midfield", 3);
		Player vicky = new Player("vicky", "goalkeeper", 4);
		
		FootBallTeamCreation obj = new FootBallTeamCreation(2,2,1,1);
		
		obj.add(shiv);
		obj.add(vicky);
		obj.add(naveen);
		obj.add(shyam);
		obj.add(ram);
		obj.add(raj);
		
		
		System.out.println("Element Add Test : is Equal  6 ="+ obj.getPlayerList().size());
		
		
		try {
			Set<Player> list = obj.formTeam();
			
			list.forEach(System.out::println);
			
			
		} catch (TeamNotFormedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
