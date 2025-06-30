import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
  // Asking a user for an input to do some operation
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter Your First Name: ");
  
  // It will only take the first string not first Line
  String first_name = scanner.next();
  // Due to not go into the next line use this to go in it.
  scanner.nextLine();
  System.out.println("You have type something: " + first_name);

  System.out.print("Enter Your Full Name: ");
  String full_name = scanner.nextLine();
  System.out.println("Full Name: " + full_name);

  System.out.print("Enter Your Number: ");
  int number = scanner.nextInt();
  System.out.println("You have entered a number: " + number);

  System.out.print("Enter Your Height: ");
  double height = scanner.nextDouble();
  System.out.println("You have entered a height: " + height);
  
  // double or int has not next line so we need scanner.nextLine();

  scanner.nextLine();
  System.out.println("Enter Quit(Q): ");
  String quit = scanner.nextLine();
  System.out.println("You are quiting");

  }
}