import java.lang.Exception;

public class UserException {
  public static void main(String[] args) {
    // Using some (method) function of expection 
    nullString();
    // undefinedArray();
    // divisible();
  }

  // Error Occur: when the variable string contain null value
  public static void nullString() {
    try {
      String name = null;
      System.out.println(name.length());
    }
    catch (NullPointerException e) {
      System.out.println("Maybe the string contain null value! Check Please");
      // e.printStackTrace();
    }
  }

  // Error Occur: when the user or loop want to access out of bound index
  public static void undefinedArray() {
    try {
      int[] nums = new int[4];

      System.out.println(nums[4]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index Out of Range!");
    }
  }

  // Error Occur: DivisibleBy Zero
  public static void divisible() {
    try {
      int a = 20;
      int b = 0;

      int result = a / b;

      System.out.println("Result: " + result);
    }
    catch (ArithmeticException e) {
      System.out.println("cannot divide by zero!");
    }
  }
}