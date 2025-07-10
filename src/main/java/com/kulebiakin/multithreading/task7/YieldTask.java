package com.kulebiakin.multithreading.task7;

public class YieldTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10_000_000; i++) {
            if (i % 250_000 == 0) {
                System.out.println(Thread.currentThread().getName() + ": Running yield step " + (i / 250_000));
                Thread.yield(); // Suggests to the thread scheduler that the current thread is willing to yield its current use of the CPU
            }
        }
        System.out.println(Thread.currentThread().getName() + ": Finished yield task");
    }
}
