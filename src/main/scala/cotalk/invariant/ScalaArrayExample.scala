package cotalk.invariant

import cotalk._

object ScalaArrayExample extends App {

  val someFood = Array[Food](
    SoyMilkShake,
    NutsAndGoatCheeseSalad,
    CheeseBurger
  )
  val someVeganFood = Array[VeganFood](SoyMilkShake)

  def longestName(meals: Array[Food]): String =
    meals.map(_.toString).maxBy(_.length)


  def replaceLast(meals: Array[Food]): Unit = {
    meals(meals.length - 1) = CheeseBurger
  }

  println(longestName(someFood))
  replaceLast(someFood)

//  println(longestName(someVeganFood))
//  replaceLast(someVeganFood)
}
