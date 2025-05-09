import java.lang.Boolean;

public class JavaLang {
  public static void main(String[] args) {
    // Boolean 
    Boolean paid = false;

    // BooleanValue method
    System.out.println("Value of paid: " + paid.BooleanValue()); // it simply return paid value; the value is false then it will return false;

    Boolean is_alive = false;

    // compareTo method
    System.out.println("Compare: " + paid.compareTo(is_alive)); // both are false or true it will return 0; vise verse return 1

    // equals method
    System.out.println("Equality: " + paid.equals(true)); // if both are true then return true;



  }
}