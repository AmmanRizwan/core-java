public class Abs {
  public static void main(String[] args) {
    Person p1 = new Person("Amman", 22, "IT");
    p1.intro();
  }
}

// abstract class will never declare as a Object
abstract class Human {
  private String name;
  private int age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // abstract method has not body it has only the signature
  public abstract void intro();

  // non abstract method have a body
  public void call() {
    System.out.println("We are Calling you a Human");
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }
}

class Person extends Human {
  private String job;

  public Person (String name, int age, String job) {
    super(name, age);
    this.job = job;
  }

  // It will only write on the inheritance class
  @Override
  public void intro() {
    System.out.println("Name: " + this.getName() + " Age: " + this.getAge() + " Job: " + this.job);
  }

  @Override
  public void call() {
    System.out.println("We are Calling you a Person");
  }
}