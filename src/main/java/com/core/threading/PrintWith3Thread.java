package main.java.com.core.threading;

public class PrintWith3Thread {

    static int nThreads = 2;
    static int PRINT_NUMBERS_UPTO=10;

    public static void main(String[] args) {

       // int nThreads = 3;
        Thread[] threadArr = new Thread[nThreads];


        for(int i=1;i<=nThreads;i++) {
            if (i == nThreads){
                threadArr[i - 1] = new Thread(new PrintSequenceRunnable(0), String.valueOf(i));
                break;
            }
            threadArr[i-1] = new Thread(new PrintSequenceRunnable(i), String.valueOf(i));
        }

        for (Thread thread : threadArr){
            thread.start();
        }

      /*  PrintSequenceRunnable runnable1=new PrintSequenceRunnable(1);
        PrintSequenceRunnable runnable2=new PrintSequenceRunnable(2);
        PrintSequenceRunnable runnable3=new PrintSequenceRunnable(0);

        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
        Thread t3=new Thread(runnable3,"T3");

        t1.start();
        t2.start();
        t3.start();*/




    }

}

class PrintSequenceRunnable implements Runnable{
    static int  number=1;
    volatile int remainder;
    static Object lock=new Object();

    PrintSequenceRunnable(int remainder)
    {
        this.remainder=remainder;
    }

    @Override
    public void run() {
        while (number < PrintWith3Thread.PRINT_NUMBERS_UPTO) {
            synchronized (lock) {
                if (number % PrintWith3Thread.nThreads != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}

