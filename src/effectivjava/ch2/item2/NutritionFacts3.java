package effectivjava.ch2.item2;

public class NutritionFacts3 {
    private final int servingSizes;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        //필수 매개 변수
        private final int servingSizes;
        private final int servings;

        // 선택 매개변수
        private  int calories=0;
        private  int fat =0;
        private  int sodium =0;
        private  int carbohydrate =0;

        public Builder(int servingSizes, int servings) {
            this.servingSizes = servingSizes;
            this.servings = servings;
        }

        public  Builder calories(int val) {
            calories=val; return  this;
        }
        public Builder fat(int val) {
            fat = val; return  this;
        }
        public Builder sodium(int val) {
            sodium=val; return  this;
        }
        public Builder carbohydrate(int val) {
            carbohydrate= val; return  this;
        }

        public NutritionFacts3 build() {
            return  new NutritionFacts3(this) ;
        }

    }

    private NutritionFacts3(Builder builder) {
        this.servingSizes = builder.servingSizes;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        // 빌더의 . 메소드는 반환값이 builder 라 . 다음과 같이 사용할 수 있다. 코드는 쓰기 쉽고 , 읽기도 쉽다.
        NutritionFacts3 n3 = new Builder(240,8).calories(5).fat(1).sodium(5).carbohydrate(10).build();

        // build() 메소드를 사용하기 전에는 , 객체가 돌아 다닐수 없음 ( 일관성 ) , 빌더의 생성자를 통해 필수값 강제 , 불변 객체 생성 가능 > private 생성자로만 세팅,
     }
}
