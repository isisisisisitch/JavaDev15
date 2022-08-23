package ca.bytetube._22_concurrent;

public class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("create a thread :" + Thread.currentThread().getName());
    }



}
