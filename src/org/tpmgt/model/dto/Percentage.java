package org.tpmgt.model.dto;

public class Percentage {
	
	private double reduce;
	private double unreduce;
	
	
	
	public Percentage() {
	}

	public Percentage(double reduce, double unreduce) {
		super();
		this.reduce = reduce;
		this.unreduce = unreduce;
	}

	public double getReduce() {
		return reduce;
	}

	public void setReduce(double reduce) {
		this.reduce = reduce;
	}

	public double getUnreduce() {
		return unreduce;
	}

	public void setUnreduce(double unreduce) {
		this.unreduce = unreduce;
	}
	
	
	
	

}
