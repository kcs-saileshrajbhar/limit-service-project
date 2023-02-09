package com.limit.microservices.bean;

import lombok.Data;

@Data
public class Limits {

	private int minmum;
	private int maximum;
	
	public Limits(int minmum, int maximum) {
		super();
		this.minmum = minmum;
		this.maximum = maximum;
	}
	
}
