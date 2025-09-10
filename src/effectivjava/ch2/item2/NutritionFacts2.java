package effectivjava.ch2.item2;

// 2. javabeans 패턴, 코드가 길어지고 인스턴스를 만들기 쉽지만 , 하나의 인스턴스를 생성하려고 많은 메소드를 호출해야하며 , 일관성이 무너진 상태에 놓인다.
public class NutritionFacts2 {
    private  int servingSizes = -1;
    private  int servings = -1;
    private  int calories = 0;
    private  int fat =0;
    private  int sodium =0;
    private  int carbohydrate=0;

    public NutritionFacts2() {
    }

    public void setServingSizes(int servingSizes) {
        this.servingSizes = servingSizes;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

}
