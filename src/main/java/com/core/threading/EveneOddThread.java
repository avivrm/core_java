package com.core.threading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EveneOddThread {
	static Object lock = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public synchronized void run() {
				synchronized (lock) {
					for (int itr = 1; itr < 51; itr = itr + 2) {

						System.out.print(" " + itr);
						try {
							lock.notify();
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public synchronized void run() {
				synchronized (lock) {
					for (int itr = 2; itr < 51; itr = itr + 2) {
						System.out.print(" " + itr);
						try {
							lock.notify();
							if (itr == 50)
								break;
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		try {
			t1.start();
			t2.start();
			// t1.join();
			// t2.join();
			System.out.println("\nPrinting over\n");
		} catch (Exception e) {

		}
	}
}