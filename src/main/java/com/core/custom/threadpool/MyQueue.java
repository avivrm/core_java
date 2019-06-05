package main.java.com.core.custom.threadpool;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<E> implements main.java.com.core.custom.threadpool.CustomQueue<E> {

	private Queue<E> queue = new LinkedList<E>();

	public void enqueue(E e) {
		queue.add(e);
		// Wake up anyone waiting on the queue to put some item.
		notifyAll();

	}

	public E dequeue() {
		E e = null;

		while (queue.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e1) {
				System.out.println(e1.getMessage());
				return e;
			}
		}
		e = queue.remove();
		return e;
	}

}
