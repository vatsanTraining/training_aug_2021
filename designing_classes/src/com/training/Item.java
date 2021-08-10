package com.training;

public class Item {

	private int itemNumber;
	private String itemName;
	private double ratePerUnit;
	
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	
//	public String getDetails() {
//		
//		return this.itemNumber+ ","+this.itemName +","+this.ratePerUnit;
//	}
	
//private String getDetails() {
//		
//		return this.itemNumber+ ","+this.itemName +","+this.ratePerUnit;
//	}


 String getDetails() {
	
	return this.itemNumber+ ","+this.itemName +","+this.ratePerUnit;
}

}
