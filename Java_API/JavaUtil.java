import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class JavaUtil {
  public static void main(String[] args) {
    // Stack 
    Stack<String> stack = new Stack<String>();

    stack.push("Minecraft");
    stack.push("Skyrim");
    stack.push("DOOM");
    stack.push("Borderland");
    stack.push("FFVII");

    stack.pop();
    stack.pop();

    // System.out.println(stack);
    // System.out.println(stack.peek());
    // System.out.println(stack.isEmpty());

  // Queue
  Queue<String> queue = new LinkedList<String>();

  queue.offer("A");
  queue.offer("B");
  queue.offer("C");
  queue.offer("D");

  queue.poll(); // remove from the index 0

  // System.out.println(queue);
  // System.out.println(queue.peek()); // return the index 0
  // System.out.println(queue.isEmpty()); // return true if the queue is empty
  // System.out.println(queue.size()); // return the length
  // System.out.println(queue.contains("D")); // return bool if the object is in the queue
  }
}