public class JavaThreadsDemo {

    public static void startThreadOne() {
        MyThread1 t1 = new MyThread1();
        t1.start();
    }

    public static void startThreadTwo() {
        Thread t2 = new Thread(new MyThread2());
        t2.start();
    }

    public static void startAnonymousThread() {
        Thread t3 = new Thread() {
            public void run() {
                System.out.println("Anonymous thread printing numbers 6 to 10:");
                for (int i = 6; i <= 10; i++) {
                    System.out.println("Anonymous Thread: " + i);
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        System.out.println("Anonymous thread interrupted");
                    }
                }
            }
        };
        t3.start();
    }

    public static void startRunnableLambda() {
        Thread t4 = new Thread(() -> {
            System.out.println("Lambda thread printing squares of 1 to 5:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda Thread: " + (i * i));
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println("Lambda thread interrupted");
                }
            }
        });
        t4.start();
    }

    public static void main(String[] args) {
        System.out.println("=== Java Threads Demonstration ===");

        startThreadOne();
        startThreadTwo();
        startAnonymousThread();
        startRunnableLambda();
    }
}
