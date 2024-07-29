// DuckDemo.java
public class DuckDemo {
  public static void makeDuckSound(Duck duck) {
    System.out.println(duck.makeSound());
  }

  public static void main(String[] args) {
    Duck realDuck = new RealDuck();
    Duck rubberDuck = new RubberDuck();

    makeDuckSound(realDuck);  // Output: Quack!
    makeDuckSound(rubberDuck);  // Output: Squeak!
  }
}