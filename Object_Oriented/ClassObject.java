public class ClassObject {
  public static void main(String[] args) {
    // an object of a class car
    Car car1 = new Car();
    Car car2 = new Car();
    Car car3 = new Car();

    // an object of a class shape
    Shape shape1 = new Shape();
    shape1.name = "Rectangle";
    shape1.size = 23;
    shape1.color = "Red";
    shape1.side = 2;

    Shape shape2 = new Shape();
    shape2.name = "Circle";
    shape2.size = 33;
    shape2.color = "Black";
    shape2.side = 0;

    // System.out.println(shape1.name);
    // System.out.println(shape1.size);
    // System.out.println(shape2.name);
    // System.out.println(shape2.color);

    // an array of object of a class
    Car[] garage = new Car[3];

    garage[0] = car1;
    garage[1] = car2;
    garage[2] = car3;

    for (Car gar : garage) {
      // no problem it will print memory address of the array car.
      System.out.println(gar);
    }

    Shape[] box = new Shape[2];

    box[0] = shape1;
    box[1] = shape2;

    for (Shape b : box) {
      System.out.println("Shape Contain Box: " + b.name);
    }
  }
}

// Creating some classes here so imagine it is other on file

// a class without attributes
class Car {

}

// a class with attributes
class Shape {
  public String name;
  public int size;
  public String color;
  public int side;
}