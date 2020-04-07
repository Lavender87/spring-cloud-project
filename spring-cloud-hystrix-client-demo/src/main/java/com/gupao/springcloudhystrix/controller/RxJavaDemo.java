package com.gupao.springcloudhystrix.controller;


import rx.Observer;
import rx.Single;
import rx.schedulers.Schedulers;

import java.util.Random;

public class RxJavaDemo {

    public static void main(String[] args) {
        Random random= new Random();

        Single.just("single say ")
                .subscribeOn(Schedulers.immediate())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("执行结束");
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        System.out.println("出现异常");
                    }

                    @Override
                    public void onNext(String s) {
                        int value = random.nextInt(200);

                        System.out.println(s+" helloWorld() costs " + value + " ms.");
                        if (value > 100) {
                            throw new RuntimeException("Timeout!");
                        }


                    }
                });


    }
}
