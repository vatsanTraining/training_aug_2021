package com.training.model;

public class Insurance {

	private int policyNumber;
	private String policyHolderName;
	private double policyAmount;
	
	protected String dummy ="Super Class";
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insurance(int policyNumber, String policyHolderName, double policyAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	public String toString() {
		return "Insurance [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName + ", policyAmount="
				+ policyAmount + "]";
	}
	
	public double calculatePremium() {
		
		return this.policyAmount * .20;
		
	}
	
}
