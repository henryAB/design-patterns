package com.unisys.factory.food;

public class Tabule implements Food {
    @Override
    public String getName() {
        return "Tabule";
    }

    @Override
    public float getPrice() {
        return 2.5f;
    }
}
