package com.example1;

public class ThreadScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myrunnable nr = new myrunnable();
		Thread t1 = new Thread(nr, "Debjit");
		t1.start();
		Thread t2 = new Thread(nr, "Deep");
		t2.start();
		Thread t3 = new Thread(nr, "Ankit");
		t3.start();

	}

}
