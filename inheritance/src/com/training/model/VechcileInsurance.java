package com.training.model;

public class VechcileInsurance extends Insurance {

	 private String modelName;
	 private int yearOfMfg;
	 
	 protected String dummy = "Sub Class";
	public VechcileInsurance() {
		super();
	}

	public VechcileInsurance(int policyNumber, String policyHolderName, double policyAmount, String modelName,
			int yearOfMfg) {
		super(policyNumber, policyHolderName, policyAmount);
		this.modelName = modelName;
		this.yearOfMfg = yearOfMfg;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getYearOfMfg() {
		return yearOfMfg;
	}

	public void setYearOfMfg(int yearOfMfg) {
		this.yearOfMfg = yearOfMfg;
	}

	@Override
	public String toString() {
		return super.dummy+"VechcileInsurance [modelName=" + modelName + ", yearOfMfg=" + yearOfMfg + "]";
	}

	@Override
	public double calculatePremium() {

		double premium = 0.0;
		
		if(yearOfMfg <=2005) {
			premium = this.getPolicyAmount() *.30;
		} else {
			premium = this.getPolicyAmount() *.15;
		}
	    return premium;
	}

	
	 
	 
}
