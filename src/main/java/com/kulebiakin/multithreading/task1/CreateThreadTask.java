package com.kulebiakin.multithreading.task1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateThreadTask {
    private static final Logger log = LoggerFactory.getLogger(CreateThreadTask.class);

    public static void main(String[] args) {
        int n = 10;
        printLinesInThread(n);
    }

    private static void printLinesInThread(int n) {
        Thread childThread = new Thread(() -> {
            for (int i = 0; i <= n; i++) {
                System.out.println("Child thread line " + i);
                sleep(100);
            }
        });

        childThread.start();

        for (int i = 1; i <= n; i++) {
            System.out.println("Main thread line " + i);
            sleep(100);
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            log.error("InterruptedException", e);
        }
    }
}
