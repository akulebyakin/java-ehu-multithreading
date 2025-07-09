package task7;

public class ThreadYieldTask {

    public static void main(String[] args) {
        Thread yielding = new Thread(new YieldTask(), "YieldingTask");
        Thread normal = new Thread(new NormalTask(), "NormalTask");

        yielding.start();
        normal.start();
    }
}
