package effectivjava.ch2.item2;

public class NutritionFacts {
    private final int servingSizes;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    public NutritionFacts(int servingSizes, int servings) {
        this(servingSizes,servings,0);
    }

    public NutritionFacts(int servingSizes, int servings, int calories) {
        this(servingSizes, servings, calories, 0);
    }

    public NutritionFacts(int servingSizes, int servings, int calories, int fat) {
        this(servingSizes,servings,calories,fat,0);
    }

    public NutritionFacts(int servingSizes, int servings, int calories, int fat, int sodium) {
        this(servingSizes,servings,calories,fat,sodium,0);
    }

    public NutritionFacts(int servingSizes, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSizes = servingSizes;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
