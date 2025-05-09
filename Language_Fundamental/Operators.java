public class Operators {
  public static void main(String[] args) {

    // Different Type of Operator 
    System.out.println("Different Types of Operators:");

    // Addition of String concatenation
    String first_name = "Amman";
    String last_name = "Rizwan";

    String full_name = first_name + " " + last_name;

    System.out.println("String Concatenation:");
    System.out.println(full_name);

    // Addition on Int-Int Value
    int a = 10;
    int b = 29;

    int result1 = a + b;
    System.out.println("Int-Int Addition: " + result1);

    // Addition on Int-Float | Int-Double Value
    int a1 = 10;
    float b1 = 9.4f;

    float result2 = (float) a1 + b1;
    System.out.println("Int-Float Addition: " + result2);

    int a2 = 11;
    double b2 = 45.5;

    double result3 = (double) a2 + b2;
    System.out.println("Int-Double Addition: " + result3);

    // Addition on Array

    double[] arr = {1,2,3,4,5,6,7.2, 3.1, 4.4};
    double total = 0;

    for (double ar : arr) {
      total += ar;
    }

    System.out.println("Addition of Array: " + total);

    // Subtraction on Int

    int num1 = 3;
    int num2 = 4;

    int result4 = num1 - num2;
    System.out.println("Result: " + result4);

    // ...go on with the multiply

    // Module Operator (%)

    int number = 10;
    int div = 3;

    int result5 = number % div;

    System.out.println("Module Result: " + result5);
  }
}