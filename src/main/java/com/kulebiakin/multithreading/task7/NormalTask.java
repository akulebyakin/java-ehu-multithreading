package com.kulebiakin.multithreading.task7;

public class NormalTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10_000_000; i++) {
            if (i % 250_000 == 0) {
                System.out.println(Thread.currentThread().getName() + ": running normal step " + (i / 250_000));
            }
        }
        System.out.println(Thread.currentThread().getName() + ": Finished normal task");
    }
}
