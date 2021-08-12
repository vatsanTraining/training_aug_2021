package com.training;

import com.training.ifaces.Function;

public class EuroToInrConverter implements Function {

	@Override
	public double apply(double args) {

		return args * 90;
	}

}
