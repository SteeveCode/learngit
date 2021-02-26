package com.animalkingdom;

public class Snake extends Reptile {
	
	public Snake() {
		super(0);
	}

	@Override
	public void move() {
		System.out.println("I'm crawling...");
	}
}
