public class JavaThread extends Thread {
  public static void main(String[] args) {
    System.out.println("Thread: " + Thread.currentThread().getName());
    Thread thread1 = new Thread();
    thread1.setName("Thread-1");
    System.out.println("Thread-1: " + thread1.getName());
  }
}