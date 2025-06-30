
public class JavaLang {
  public static void main(String[] args) {
    // Boolean 
    Boolean paid = false;

    // BooleanValue method
    System.out.println("Value of paid: " + paid.booleanValue()); // it simply return paid value; the value is false then it will return false;

    Boolean is_alive = false;

    // compareTo method
    System.out.println("Compare: " + paid.compareTo(is_alive)); // both are false or true it will return 0; vise verse return 1

    // equals method
    System.out.println("Equality: " + paid.equals(true)); // if both are true then return true;

    Byte num = 12;

    System.out.println(num.byteValue()); // simple return the value

    System.out.println(num.doubleValue()); // convert the byte into double type

    System.out.println(num.intValue()); // convert the byte into int type

    System.out.println(num.floatValue()); // convert the byte into float type

    // Character
    Character symbol = '@';

    System.out.println(symbol.charValue()); // return the char value;

    // After Character, it will go through ... Double, Float, Integer, Long, Number, Object

    // Math 
    double pi = Math.PI;

    double number = 23.44;

    System.out.println(Math.round(number));

    System.out.println(Math.ceil(number));
    
    System.out.println(Math.floor(number));
    
    System.out.println(Math.abs(number));
    
    System.out.println(Math.max(1, 3));
    
    System.out.println(Math.min(1, 4));

    enum Direction {
      NORTH, SOUTH, EAST, WEST;
    }

    Direction pos = Direction.NORTH;

    System.out.println(pos);
  }
}