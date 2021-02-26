package com.animalkingdom;

public class Bird extends Animal {
	
	public Bird() {
		this("Black");
	}
	
	public Bird(String color) {
		super(4, color);
	}

	@Override
	public void move() {
		System.out.println("I'm flying...");
	}
}
