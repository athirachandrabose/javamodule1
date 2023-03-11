package Multithreading;

import java.util.Iterator;

public class MyThread extends Thread {

	public String name;

	public MyThread() {
		// TODO Auto-generated constructor stub

	}

	public MyThread(String name) {
		super();
		this.name = name;
	}

	public void run() {

		for (int i = 1; i < 5; i++) {
			System.out.println(name + " = " + i);

		}
	}
}