package cotalk.variant

import cotalk._

object DinnerGuest extends App {

  trait Consumer[T] {
    def consume(value: T): Unit
  }

  case object HomerSimpson extends Consumer[Food] {
    override def consume(meal: Food): Unit = {
      println(s"I like $meal because I like everything")
    }
  }

  case object Gandhi extends Consumer[VegetarianFood] {
    override def consume(meal: VegetarianFood): Unit = {
      println(s"You can enjoy $meal without eating meat")
    }
  }

  case object MikeTyson extends Consumer[VeganFood] {
    override def consume(meal: VeganFood): Unit = {
      println(s"$meal, better than an ear!")
    }
  }

  def feedWith[F <: Food](food: F, consumers: Consumer[F]*): Unit = {
    consumers.foreach(_.consume(food))
  }

//  feedWith(food = CheeseBurger, consumers = HomerSimpson)
//  feedWith(food = NutsAndGoatCheeseSalad, consumers = HomerSimpson, Gandhi)
//  feedWith(food = SoyMilkShake, consumers = HomerSimpson, Gandhi, MikeTyson)
}
