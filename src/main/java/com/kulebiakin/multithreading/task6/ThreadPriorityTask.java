package com.kulebiakin.multithreading.task6;

public class ThreadPriorityTask {

    public static void main(String[] args) {
        Thread important = new Thread(new ImportantTask(), "ImportantTask-HIGH");
        Thread procrastinating = new Thread(new ProcrastinatingTask(), "ProcrastinatingTask-LOW");

        important.setPriority(Thread.MAX_PRIORITY);   // 10
        procrastinating.setPriority(Thread.MIN_PRIORITY); // 1

        important.start();
        procrastinating.start();
    }
}
