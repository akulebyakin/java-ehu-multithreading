package task3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadJoinTask {

    private static final Logger log = LoggerFactory.getLogger(ThreadJoinTask.class);

    public static void main(String[] args) {
        int n = 10;
        printLinesInThread(n);
    }

    private static void printLinesInThread(int n) {
        Thread childThread = new Thread(() -> {
            for (int i = 1; i <= n; i++) {
                System.out.println("Child thread line " + i);
                sleep(100);
            }
        });

        childThread.start();

        try {
            // Wait for the child thread to finish before proceeding
            childThread.join();
        } catch (InterruptedException e) {
            log.error("InterruptedException", e);
        }

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
