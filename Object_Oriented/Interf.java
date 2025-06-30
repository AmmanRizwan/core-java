public class Interf {
  public static void main(String[] args) {
    Fish f1 = new Fish();

    f1.pray();
    f1.eat();
  }
}

interface Pray {
  public void pray();
}

interface Preditor {
  public void eat();
}

class Fish implements Pray, Preditor {
  @Override
  public void pray() {
    System.out.println("This Fish is praying...");
  }

  @Override
  public void eat() {
    System.out.println("This Fish is eating...");
  }
}

interface DigitalBook {
  public void setFileSize();
}

interface TraditionalBook {
  public void setWeight();
}

class Book implements DigitalBook, TraditionalBook {
  public String name;
  public int pages;
  public boolean available;

  public Book(String name, int pages, boolean available) {
    this.name = name;
    this.pages = pages;
    this.available = available;
  }

  @Override
  public void setFileSize() {
    System.out.println("It Contain Only 3.5KB");
  }

  @Override
  public void setWeight() {
    System.out.println("It is Very Heavy!");
  }
}