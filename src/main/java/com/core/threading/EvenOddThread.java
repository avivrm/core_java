package main.java.com.core.threading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddThread {

   AtomicInteger counter = new AtomicInteger(1);

    static int number = 10;
    static int totalThread = 2;

    class Printer implements Runnable{

        int remainder;
        Object lock;
        int threadNo;

        public Printer(int remainder, Object lock, int threadNo) {
            this.remainder = remainder;
            this.lock = lock;
            this.threadNo = threadNo;
        }

        @Override
        public void run() {

            while (counter.getPlain() <= EvenOddThread.number) {

                synchronized (lock){
                    if (counter.getPlain() % EvenOddThread.totalThread == remainder) {
                        System.out.println(Thread.currentThread().getName() + " " + counter.getPlain());
                        counter.getAndIncrement();
                        lock.notifyAll();
                    }

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

                /*synchronized (lock) {
                    if (counter.getPlain() == EvenOddThread.number)
                        break;
                    try {
                        if (counter.getPlain() % EvenOddThread.totalThread != remainder) {
                            lock.wait();
                        }
                        System.out.println(Thread.currentThread().getName() + " " + counter.getPlain());
                        counter.getAndIncrement();
                        lock.notifyAll();


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }*/
            }

        }
    }

    public static void main(String[] args){

            Object lock = new Object();

            EvenOddThread obj = new EvenOddThread();

            Printer p1 = obj.new Printer(1,lock, 1);
            Printer p2 = obj.new Printer(0,lock, 2);

            Thread t1 = new Thread(p1,"odd");
            Thread t2 = new Thread(p2,"even");

            t1.start();
            t2.start();
    }
}
