public class Poly {
  public static void main(String[] args) {
    Human h1 = new Human("Amman", 23);

    System.out.println("Human 1: " + h1.getName());

    Developer d1 = new Developer("Rizwan", 23, "C");
    System.out.println("Developer 1: " + d1.getLanguage());

    System.out.println(d1);

    DevOps do1 = new DevOps("A", 22, "C++", "GitHub");

    System.out.println(do1);
  }
}

class Human {
  public String name;
  public int age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  // this method will follow the polymorphism
  public void whatAreYou() {
    System.out.println("I am a Human");
  }

  // Method overriding to
  @Override
  public String toString() {
    String result = "Name: " + this.name + " Age: " + this.age;
    return result;
  }
}

class Developer extends Human {
  public String language;

  public Developer(String name, int age, String language) {
    super(name, age);
    this.language = language;
  }

  public String getLanguage() {
    return this.language;
  }

  // this method will follow the polymorphism
  @Override
  public void whatAreYou() {
    System.out.println("I am Developer");
  }

  @Override
  public String toString() {
    String result = "Name: " + this.name + " Age: " + this.age + " Lang: " + this.language;
    return result;
  }
}

class DevOps extends Developer {
  public String ci_cd_tool;

  public DevOps(String name, int age, String language, String ci_cd_tool) {
    super(name, age, language);
    this.ci_cd_tool = ci_cd_tool;
  }

  public String getCiCdTool() {
    return this.ci_cd_tool;
  }

  // this method will follow the polymorphism
  @Override
  public void whatAreYou() {
    System.out.println("I am a DevOps");
  }

  @Override
  public String toString() {
    String result = "Name: " + this.name + " Age: " + this.age + " Lang: " + this.language + " CI/CD: " + this.ci_cd_tool;
    return result;
  }
}