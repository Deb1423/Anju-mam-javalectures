package com.bank;

public class MyAccount implements Runnable {

	private Account acc = new Account();

	public static void main(String[] args) {
		MyAccount a1 = new MyAccount();
		Thread t1 = new Thread(a1, "Debjit");
		Thread t2 = new Thread(a1, "Ankit");

		t1.start();
		t2.start();
	}

}
