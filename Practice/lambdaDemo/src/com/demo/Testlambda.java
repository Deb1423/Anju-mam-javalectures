package com.demo;

public class Testlambda {

	public static void main(String[] args) {
		Drawable d = new Drawable() {
			@override
			public void draw() {
				System.out.println("I am drawing a circle");
			}
		};

		d.draw();
	}

}
