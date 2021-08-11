package com.training;

public class Item {

	// All instance variable has a default value
	
	private int itemNumber;
	private String itemName;
	private double ratePerUnit;
	
	
	// Over loaded constructor  - 0, 2 and 3 arguments
	
	// Constructors can be overloaded
	// And overloaded constructors are accesses with this()
	
	public Item() {
		this(000,"sample",1.0);
	}
	
	public Item(int itemNumber, String itemName) {
		this(itemNumber,itemName,1.0);
		
		this.itemNumber = itemNumber;
		this.itemName = itemName;
	}


	public Item(int itemNumber, String itemName, double ratePerUnit) {
		super();
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.ratePerUnit = ratePerUnit;
	}


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
