public class Inherit {
  public static void main(String[] args) {
    Animal animal1 = new Animal(false);

    // System.out.println(animal1.getAlive());

    Dog dog1 = new Dog("Puppy", true);
    System.out.println(dog1.getAlive());
    System.out.println(dog1.getName());

  }
}

class Animal {
  private boolean alive;

  public Animal(boolean alive) {
    this.alive = alive;
  }

  public boolean getAlive() {
    return this.alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }
}

class Dog extends Animal {
  private String name;

  public Dog(String name, boolean alive) {
    super(alive);
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}