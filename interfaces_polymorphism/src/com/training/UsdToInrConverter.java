package com.training;

import com.training.ifaces.Function;

public class UsdToInrConverter implements Function {

	public UsdToInrConverter() {
	}

	@Override
	public double apply(double args) {

		return args *70;
	}

}
