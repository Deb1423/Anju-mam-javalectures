package com.example1;

public class myrunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
