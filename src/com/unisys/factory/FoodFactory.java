package com.unisys.factory;

import com.unisys.factory.food.Food;
import com.unisys.factory.food.Kitkat;
import com.unisys.factory.food.Sandwich;
import com.unisys.factory.food.Tabule;

public class FoodFactory {

    public Food createFood(int code) {
        Food food = null;
        switch (code) {
            case 0:
                food = new Kitkat();
                break;
            case 1:
                food = new Sandwich();
                break;
            case 2:
                food = new Tabule();
                break;
        }
        return food;
    }

}
