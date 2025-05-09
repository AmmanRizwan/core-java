public class ControlFlow {
  public static void main(String[] args) {
    System.out.println("If Else Statement");

    // Identify the age is valid of not
    // using numerical value
    int age = 20;

    if (age > 18) {
      System.out.println("You are eligible for vote");
    } 
    else {
      System.out.println("You are not eligible for vote");
    }

    // using string
    String password = "123456";

    if (password.length() > 8) {
      System.out.println("You have written a strong password.");
    }
    else {
      System.out.println("You have written a weak password.");
    }

    // using ! operator (boolean)

    boolean login = false;

    if (!login) {
      System.out.println("You are not Login. Please go an Login!");
    }
    else {
      System.out.println("You have Login. Hello, User");
    }

    // Logical Operator

    if (age > 18 && password.length() > 8) {
      System.out.println("You are mature. Yo! Hello, Mature User");
    }
    else {
      System.out.println("You are not mature enough to set a password");
    }

    if (password.length() > 3 || login) {
      System.out.println("You have getting a permission to login");
    }
    else {
      System.out.println("You have not getting a permission to login");
    }

    // Switch Case

    int value = 0;

    switch (value) {
      case 0: System.out.println("You have Press 0 Button");break;
      case 1: System.out.println("You have Press 1 Button");break;
      case 2: System.out.println("You have Press 2 Button");break;
      case 3: System.out.println("You have Press 3 Button");break;
      case 4: System.out.println("You have Press 4 Button");break;
      case 5: System.out.println("You have Press 5 Button");break;
      case 6: System.out.println("You have Press 6 Button");break;
      case 7: System.out.println("You have Press 7 Button");break;
      case 8: System.out.println("You have Press 8 Button");break;
      case 9: System.out.println("You have Press 9 Button");break;
      case 10: System.out.println("You have Press 10 Button");break;
      default: System.out.println("No! It is not a number you have press!");
    }


    // Loops in Repeat the Thing in ones

    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
    }

    for (int index = 0; index < 10; index++) {
      System.out.println(index);
    }

    int x = 0;
    do
    {
      System.out.println(x);
      x++;
    }
    while (x < 10);
  }
}