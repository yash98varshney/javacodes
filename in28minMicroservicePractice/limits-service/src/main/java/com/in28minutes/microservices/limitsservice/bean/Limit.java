package com.in28minutes.microservices.limitsservice.bean;

public class Limit {

	private int minimum;
	private int maximum;
	
	public Limit(int i, int j) {
		minimum=i;
		maximum=j;
	}
	public Limit() {
		super();
	}
	

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}


}
