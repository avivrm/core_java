package com.core.rxJava;


import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.schedulers.Schedulers;

public class MyRxClass {

    public static void main(String[] args) {

        Observable<String> myObservable =Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Started ");
                subscriber.onCompleted();
                subscriber.onError(new IllegalArgumentException("Error Occured"));
            }
        });

        Subscriber<String> stringSubscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("In subscriber Completed");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(" In subscriber throwable = [" + throwable.toString() + "]");
            }

            @Override
            public void onNext(String s) {
                System.out.println(" In subscriber s = [" + s.toUpperCase() + "]");
            }
        };

        Observer<String> stringObserver =new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("In observer");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("In observer throwable = [" + throwable.getMessage() + "]");
            }

            @Override
            public void onNext(String s) {
                System.out.println("In observer s = [" + s + "]");
            }
        };

        myObservable.subscribe(stringSubscriber);
        myObservable.subscribe(stringObserver);



    }

}
