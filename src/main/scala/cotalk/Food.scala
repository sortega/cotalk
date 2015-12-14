package cotalk

trait Food
trait VegetarianFood extends Food
trait VeganFood extends VegetarianFood

case object CheeseBurger extends Food {
  override def toString = "Cheese Burger"
}

case object NutsAndGoatCheeseSalad extends VegetarianFood {
  override def toString = "Salad with nuts and goat cheese"
}

case object SoyMilkShake extends VeganFood {
  override def toString = "Soy milk shake"
}
