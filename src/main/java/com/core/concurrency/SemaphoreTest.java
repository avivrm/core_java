package main.java.com.core.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    enum downloader{

        INSTANCE;

        private Semaphore sem = new Semaphore(3, true);

        public void downloadWeb(){
            try {
                sem.acquire();
                download();
            } catch(InterruptedException e){
                System.out.println("");
            }finally {
                sem.release();
            }
        }

        private void download() {

            System.out.println(Thread.currentThread().getName()+ " Download starts...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " Download complete...");

        }
    }


        public static void main(String[] args) {

            ExecutorService es = Executors.newCachedThreadPool();

            for(int i = 1;i<15;i++){
                es.execute(new Runnable() {
                    @Override
                    public void run() {
                        downloader.INSTANCE.downloadWeb();
                    }
                });
            }
        }



}
