package com.kulebiakin.multithreading.task2;

public class T1Thread extends Thread{

    public T1Thread(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        System.out.println("T1Thread is running");
    }
}
