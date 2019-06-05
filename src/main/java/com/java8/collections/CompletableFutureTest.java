package main.java.com.java8.collections;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(()-> getDataById(10))
                .thenApply(data -> sendData(data));

        cf.get();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(
                ()-> getDataById(10),
                executorService
        )
                .thenApply(data -> sendData(data));

        cf1.get();
        executorService.shutdown();



        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(()-> getDataById(10))
                .whenComplete((data, error) -> {
                    consumeData(data);
                    if(error!= null) {
                        System.out.println(error);
                    }
                });
        cf2.get();
    }
    private static String getDataById(int id) {
        System.out.println("getDataById: "+ Thread.currentThread().getName());
        return "Data:"+ id;
    }
    private static String sendData(String data) {
        System.out.println("sendData: "+ Thread.currentThread().getName());
        System.out.println(data);
        return data;
    }

    private static void consumeData(String data) {
        System.out.println("consumeData: "+ Thread.currentThread().getName());
        System.out.println(data);
    }
}
