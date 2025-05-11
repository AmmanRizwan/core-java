public class JavaThread extends Thread {
  public static void main(String[] args) {
    // Check the current Thread running
    System.out.println("Thread: " + Thread.currentThread().getName());

    // Check how many Thread are running
    System.out.println("Active Thread: " + Thread.activeCount());

    // Create a new Thread
    Thread thread1 = new Thread();

    thread1.setName("T-1");

    System.out.println("Thread Name: " + thread1.getName());
    // start the thread
    thread1.start();

    // Check now how many thread is running
    System.out.println("Active Thread: " + Thread.activeCount()); // 2

  }
}