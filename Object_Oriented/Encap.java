public class Encap {
  public static void main(String[] args) {
    Person p1 = new Person("Amman", 22, true, 23.2, 11.2);
    
    String result = p1.toString();
    System.out.println(result);

    System.out.println(p1.getAlive());
  }
}

class Person {
  // attribute
  private String name;
  private int age;
  private boolean alive;
  private double height;
  private double weight;

  // constructor
  public Person(String name, int age, boolean alive, double height, double weight) {
    this.name = name;
    this.age = age;
    this.alive = alive;
    this.height = height;
    this.weight = weight;
  }

  // getter method to get the value of an name property
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public boolean getAlive() {
    return this.alive;
  }

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  // setter method to set the name property
  public void setName(String name) {
    this.name = name;
  } 

  public void setAge(int age) {
    this.age = age;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    String result = "name: " +this.name + " age: " + this.age;
    return result;
  }
}
