package com.unisys.singleton;

public class VendingRoutine {

    private static VendingRoutine instance = new VendingRoutine();

    private VendingRoutine() {}

    public static VendingRoutine getInstance() {
        return instance;
    }
}
