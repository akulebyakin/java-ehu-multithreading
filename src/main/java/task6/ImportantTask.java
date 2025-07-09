package task6;

public class ImportantTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10_000_000; i++) {
            if (i % 250_000 == 0) {
                System.out.println(Thread.currentThread().getName() + ": Completed important step " + (i / 250_000));
            }
        }
        System.out.println(Thread.currentThread().getName() + ": Finished important work.");
    }
}
