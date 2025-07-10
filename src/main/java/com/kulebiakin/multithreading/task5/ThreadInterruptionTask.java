package com.kulebiakin.multithreading.task5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadInterruptionTask {

    private static final Logger log = LoggerFactory.getLogger(ThreadInterruptionTask.class);

    public static void main(String[] args) {
        Thread sleeper = new Thread(() -> {
            try {
                System.out.println("Thread going to sleep...");
                Thread.sleep(5000); // Sleeping for 5 seconds
                System.out.println("Thread woke up normally.");
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted during sleep!");
            }
        });

        sleeper.start();

        try {
            Thread.sleep(1000); // Wait a bit before interrupting
        } catch (InterruptedException e) {
            log.error("Main thread was interrupted while sleeping.", e);
        }

        System.out.println("Main thread interrupts sleeper thread.");
        sleeper.interrupt(); // Interrupt the sleeping thread

    }
}