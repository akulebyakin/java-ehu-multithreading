package com.kulebiakin.multithreading.task4;

public class TextSequencePrinter implements Runnable {

    private final String[] messages;

    public TextSequencePrinter(String[] messages) {
        this.messages = messages;
    }

    @Override
    public void run() {
        for (String msg : messages) {
            System.out.println(Thread.currentThread().getName() + ": " + msg);
        }
    }
}
