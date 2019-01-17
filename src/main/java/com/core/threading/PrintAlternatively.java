package com.core.threading;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintAlternatively {


   static volatile AtomicInteger val = new AtomicInteger(1);

    public static void main(String[] args) {
        Object mutex = new Object();
        Runnable1 run1 = new Runnable1(mutex, val);
        Runnable2 run2 = new Runnable2(mutex, val);

        Thread t1 = new Thread(run1, "A");
        Thread t2 = new Thread(run2, "B");

        t1.start();
        try{
            Thread.sleep(1000);



        t2.start();

       t1.join();
       t2.join();

            System.out.println("Threads ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Runnable1 implements Runnable{

    Object lock;
    AtomicInteger val ;
    public Runnable1(Object lock, AtomicInteger val) {
        this.lock = lock;
        this.val = val;
    }

    @Override
    public void run() {

        while(val.get() < 12){
                   synchronized(lock){
                       System.out.println(Thread.currentThread().getName() + " " +  val.get());
                       if(val.get() == 11)
                           break;
                       try{
                           lock.notify();
                           lock.wait();
                       }catch (InterruptedException e){
                           System.out.println(e.getMessage());
                       }

               }
           }

    }

}

class Runnable2 implements Runnable{

    Object lock;
    AtomicInteger val ;
    public Runnable2(Object lock, AtomicInteger val) {
        this.lock = lock;
        this.val = val;
    }

    @Override
    public void run() {

            while(val.get() <12){
                synchronized(lock){
                    System.out.println(Thread.currentThread().getName() + " " +  val.getAndIncrement());
                    if(val.get() == 11)
                        break;
                    try{
                        lock.notify();
                        lock.wait();
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }

            }
        }

    }

}
