package com.gupao.springcloudhystrix.controller;

import java.util.Random;
import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args){
        Random random= new Random();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future future = executorService.submit(()->{
            int nextVal =random.nextInt();
            System.out.printf("helloWorld costs "+nextVal+" ms");
            Thread.sleep(1000);
            return "Hello World";
        });

        try {
            future.get(100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

    }
}
