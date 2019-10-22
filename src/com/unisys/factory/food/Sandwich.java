package com.unisys.factory.food;

public class Sandwich implements Food {
    @Override
    public String getName() {
        return "Sandwich";
    }

    @Override
    public float getPrice() {
        return 1.5f;
    }
}
