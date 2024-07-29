// Method to demonstrate Liskov Substitution Principle violation
public class DuckDemo {
  public static void makeDuckQuack(Duck duck) {
      System.out.println(duck.quack());
  }

  public static void main(String[] args) {
      Duck realDuck = new RealDuck();
      Duck rubberDuck = new RubberDuck();

      makeDuckQuack(realDuck);  // Output: Quack!
      makeDuckQuack(rubberDuck);  // Throws UnsupportedOperationException
  }
}