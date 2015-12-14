package cotalk.array;

public class JavaArrayExample {

    public static String longestName(Food[] meals) {
        String longestName = "";
        for (Food meal : meals) {
            if (meal.getName().length() > longestName.length()) {
                longestName = meal.getName();
            }
        }
        return longestName;
    }

    public static void replaceLast(Food[] meals) {
        meals[meals.length - 1] = new Food("Pizza");
    }

    public static void main(String[] args) {
        Food[] someFood = {
                new Food("Cheese burger"),
                new VegetarianFood("Fish salad")
        };
        VeganFood[] someVeganFood = {
                new VeganFood("Soy pudding"),
                new VeganFood("Nuts salad")
        };

//        System.out.println(longestName(someFood));
//        System.out.println(longestName(someVeganFood));

//        replaceLast(someFood);
//        replaceLast(someVeganFood);
    }
}
