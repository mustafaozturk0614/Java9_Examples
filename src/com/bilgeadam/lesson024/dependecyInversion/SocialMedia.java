package com.bilgeadam.lesson024.dependecyInversion;

public abstract class SocialMedia {

	private double scaleRatio;

	public abstract void changeScaleRatio(String type);

	public double getScaleRatio() {
		return scaleRatio;
	}

	public void setScaleRatio(double scaleRatio) {
		this.scaleRatio = scaleRatio;
	}

}
