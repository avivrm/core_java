package main.java.com.core.custom.threadpool;

public class TestThreadPoolManager {

	 public static void main(String[] args) {
	        main.java.com.core.custom.threadpool.ThreadPoolManager poolManager = new main.java.com.core.custom.threadpool.ThreadPoolManager(10);
	         
	        //now lets submit task
	        poolManager.submitTask(new Runnable() {
	            //@Override
	            public void run() {
	                System.out.println("Starting Task A....");
	                try {
	                    Thread.sleep(5000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                System.out.println("Task A Completed....");
	            }
	        });
	         
	        poolManager.submitTask(new Runnable() {
	            //@Override
	            public void run() {
	                System.out.println("Starting Task B....");
	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                System.out.println("Task B Completed....");
	            }
	        });
	    }
	
}
