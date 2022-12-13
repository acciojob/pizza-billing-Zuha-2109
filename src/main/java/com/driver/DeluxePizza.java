package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here


        //local not found automatically calls parent

        addExtraCheese();
        addExtraToppings();

        //not right because it always go to parent class
//        super.addExtraCheese();
//        super.addTakeaway();
//
//        //local not found automatically calls parent
//        this.addExtraCheese();
//        this.addExtraToppings();
    }
}
