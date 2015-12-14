package cotalk.invariant

import scala.collection.mutable

import cotalk._

object MutableListExample extends App {

  def longestName(meals: mutable.Seq[Food]): String =
    meals.map(_.toString).maxBy(_.length)

  def replaceLast(meals: mutable.Seq[Food]): Unit = {
    meals(meals.length - 1) = SoyMilkShake
  }

  val someFood = mutable.Seq[Food](SoyMilkShake, NutsAndGoatCheeseSalad, CheeseBurger)
  val someVeganFood = mutable.Seq(SoyMilkShake)

  println(longestName(someFood))
  replaceLast(someFood)
//  println(longestName(someVeganFood))
//  replaceLast(someVeganFood)
}
