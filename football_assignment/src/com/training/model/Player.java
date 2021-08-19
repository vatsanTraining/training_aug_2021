package com.training.model;

public class Player implements Comparable<Player> {

	private String playerName;
	private String category;
	private int ranking;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String playerName, String category, int ranking) {
		super();
		this.playerName = playerName;
		this.category = category;
		this.ranking = ranking;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", category=" + category + ", ranking=" + ranking + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + ranking;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		if (ranking != other.ranking)
			return false;
		return true;
	}
	@Override
	public int compareTo(Player o) {
		return this.playerName.compareTo(o.playerName);
	}

}
