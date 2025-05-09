public class DataType {
  public static void main(String[] args) {
    // Data Types of the Java

    System.out.println("Data Types in Java Language:");
    int number = 12; // numeric with not contain any decimal

    System.out.println("Integer Value: " + number);

    float num = 23.5f; // numeric with decimal but need f to identify it is floating number
    
    System.out.println("Floating Value: " + num);

    double weight = 23.232; // floating number
    
    System.out.println("Double Value: " + weight);

    char x = 'a'; // single character

    System.out.println("Character: " + x);
    
    String name = "Amman"; // Sequence of characters, word

    System.out.println("Word: " + name);

    int[] arr = {1,2,3,4,5,6}; // list of numeric value

    // old way to print arr
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.println(arr[i]);
    // }

    System.out.println("Array of Number:");
    for (int i : arr) {
      System.out.println(i);
    }

    String[] list_name = {"C", "C++", "Java", "Python"}; // list of sequence of characters

    System.out.println("Array of String:");
    for (String list : list_name) {
      System.out.println(list);
    }
  }
}