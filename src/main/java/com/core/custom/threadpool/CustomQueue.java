package main.java.com.core.custom.threadpool;

public interface CustomQueue<E> {

	public void enqueue(E e);

	public E dequeue();
}
