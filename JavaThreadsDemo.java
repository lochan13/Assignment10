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

}
