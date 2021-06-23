package com.animalkingdom;

public class Reptile extends Animal {
	
	public Reptile(int limbCount) {
		super(limbCount);
	}

	@Override
	public void move() {
		System.out.println("I'm slithering...");
	}
	
	public void move(int numberOfSteps) {
		
	}
	
	public void move(int numberOfSteps, String direction) {
		
	}
}
