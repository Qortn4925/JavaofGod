package effectivjava.ch2.item2;

import static effectivjava.ch2.item2.NyPizza.Size.SMALL;

public class BuilderEx {

    public static void main(String[] args) {

        NyPizza nyPizza = new NyPizza.Builder(SMALL).addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();

        Calzone calzone = new Calzone.Builder().addTopping(Pizza.Topping.HAM).sauceInside().build();

        System.out.println("calzone.toppings = " + calzone.toppings);
        System.out.println("ny = " +  nyPizza.toString());
        System.out.println("calzone = " +  calzone.toString());


    }
}
