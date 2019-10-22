package com.unisys.factory;

import com.unisys.factory.food.Food;

import java.util.ArrayList;
import java.util.List;

public class FactoryMain {

    public static void main(String... args) {

        FoodFactory foodFactory = new FoodFactory();

        List<Food> vendingFood = new ArrayList<>();

        vendingFood.add(foodFactory.createFood(0));
        vendingFood.add(foodFactory.createFood(1));
        vendingFood.add(foodFactory.createFood(2));
        vendingFood.add(foodFactory.createFood(1));
        vendingFood.add(foodFactory.createFood(1));
        vendingFood.add(foodFactory.createFood(0));

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Comida en la maquina de vending: ");

        for (Food food : vendingFood) {
            System.out.println(food.getName() + ", precio: " + food.getPrice() + "€");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
