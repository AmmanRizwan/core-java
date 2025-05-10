import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.ArrayList;

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

  System.out.println(queue);
  System.out.println(queue.peek()); // return the index 0
  System.out.println(queue.isEmpty()); // return true if the queue is empty
  System.out.println(queue.size()); // return the length
  System.out.println(queue.contains("D")); // return bool if the object is in the queue

  // Priority Queue
  Queue<Double> pQueue = new PriorityQueue<Double>(Collections.reverseOrder()); // collections will have the method of reverse

  pQueue.offer(5.0);
  pQueue.offer(2.5);
  pQueue.offer(1.5);
  pQueue.offer(2.0);
  pQueue.offer(3.0);

  // priority queue will return in asc order 

  while (!pQueue.isEmpty()) {
    System.out.println(pQueue.poll()); // it will print all the value
  }

  // LinkedList
  LinkedList<String> linkedList = new LinkedList<String>();

  linkedlist.push("A");
  linkedlist.push("B");
  linkedlist.push("C");
  linkedlist.push("D");
  linkedlist.push("F");

  linkedlist.add(3, "E");
  linkedlist.remove("E");

  System.out.println(linkedlist.indexOf("F"));

  System.out.println(linkedlist.peekFirst());
  System.out.println(linkedlist.peekLast());
  linkedlist.addFirst("0");
  linkedlist.addLast("G");

  // String first = linkedlist.removeFirst();
  // String last = linkedlist.removeLast();

  System.out.println(linkedlist);

  // ArrayList

  ArrayList<Integer> array = new ArrayList<Integer>();

  array.add(1);
  array.add(2);
  array.add(3);
  array.add(4);

  System.out.println(array.get(3));

  array.get(1,1);
  array.get(3, 0);

  System.out.println(array);

  }
}