package task1;

public class CreateThreadTask {

    public static void main(String[] args) {
        int n = 10;
        printLinesInThread(n);
    }

    private static void printLinesInThread(int n) {
        Thread childThread = new Thread(() -> {
            for (int i = 0; i <= n; i++) {
                System.out.println("Child thread line " + i);
            }
        });

        childThread.start();

        for (int i = 1; i <= n; i++) {
            System.out.println("Main thread line " + i);
        }
    }
}
