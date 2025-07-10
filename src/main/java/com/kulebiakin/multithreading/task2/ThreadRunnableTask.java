package com.kulebiakin.multithreading.task2;

public class ThreadRunnableTask {

    public static void main(String[] args) {
        /* Thread implementation of run() will be executed, because it's overridden in T1Thread
           Default implementation of run()
                if (target != null) {
                    target.run();
                }
         */
        Thread thread = new T1Thread(new RunnableClass());
        thread.start();

        // Using Runnable
        Runnable runnable = new RunnableClass();
        Thread runnableThread = new Thread(runnable);
        runnableThread.start();
    }
}
