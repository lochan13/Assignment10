public class JavaThreadsDemo {

    public static void startThreadOne() {
        MyThread1 t1 = new MyThread1();
        t1.start();
    }

    public static void startThreadTwo() {
        Thread t2 = new Thread(new MyThread2());
        t2.start();
    }

}
