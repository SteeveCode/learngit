package com.animalkingdom;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	private String color;
	private int numberOfLimbs;
	private String eyeColor;
	
	private List<Eye> eyes = new ArrayList<>();
	
	private Breather breather;
	
	//public Animal() {}
	
	public Animal(int limbsCount) {
		numberOfLimbs = limbsCount;
	}
	
	public Animal(int numberOfLimbs, String animalColor) {
		this.numberOfLimbs = numberOfLimbs;
		color = animalColor;
	}
	
	public void move() {
		System.out.println("I'm not moving...");
	}
	
	public void eat() {
		System.out.println("I'm eat...");
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumberOfLimbs() {
		return numberOfLimbs;
	}
	public void setNumberOfLimbs(int numberOfLimbs) {
		this.numberOfLimbs = numberOfLimbs;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public List<Eye> getEyes() {
		return eyes;
	}

	public void setEyes(List<Eye> eyes) {
		this.eyes = eyes;
	}

	public Breather getBreather() {
		return breather;
	}

	public void setBreather(Breather breather) {
		this.breather = breather;
	}
}
