public class MyThread2 implements Runnable {
  @Override
  public void run() {
    System.out.println("MyThread2 is printing characters A to E:");
    for (char c = 'A'; c <= 'E'; c++) {
      System.out.println("Thread-2: " + c);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println("Thread-2 Interrupted");
      }
    }
  }
}
