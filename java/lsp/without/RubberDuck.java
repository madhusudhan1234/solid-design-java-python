// Class RubberDuck (violates LSP)
class RubberDuck implements Duck {
  @Override
  public String quack() {
      throw new UnsupportedOperationException("Rubber ducks don't quack, they squeak!");
  }

  public String squeak() {
      return "Squeak!";
  }
}