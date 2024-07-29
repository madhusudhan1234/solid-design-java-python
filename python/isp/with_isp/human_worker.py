from workable_interface import WorkableInterface
from eatable_interface import EatableInterface

class HumanWorker(WorkableInterface, EatableInterface):
  def work(self):
    print("Human working")

  def eat(self):
    print("Human eating")