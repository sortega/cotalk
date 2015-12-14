package cotalk.variant

import cotalk._

object Restaurant extends App {

  trait Producer[T] {
    def produce(): T
  }

  case object McBurger extends Producer[Food] {
    override def produce() = CheeseBurger
    override def toString = "McBurger Franchise #23455"
  }

  case object SaladBuffet extends Producer[VegetarianFood] {
    override def produce() = NutsAndGoatCheeseSalad
    override def toString = "Fresh Salad Buffet"
  }

  case object CrueltyFreeRestaurant extends Producer[VeganFood] {
    override def produce() = SoyMilkShake
    override def toString = "Crudi-vegetarians to the core"
  }

  def collect[F <: Food](restaurants: Producer[F]*): Seq[F] = {
    restaurants.map(_.produce())
  }

//  println(collect[VeganFood](CrueltyFreeRestaurant, CrueltyFreeRestaurant))
//  println(collect[VegetarianFood](CrueltyFreeRestaurant, SaladBuffet))
//  println(collect[Food](CrueltyFreeRestaurant, SaladBuffet, McBurger))
}
