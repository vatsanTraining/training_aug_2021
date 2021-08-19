package com.training.ifaces;

import com.training.exceptions.TeamNotFormedException;
import com.training.model.Player;
import java.util.*;


public interface TeamCreation {

	public boolean add(Player p);

	public Collection<Player> formTeam() throws TeamNotFormedException;

}
