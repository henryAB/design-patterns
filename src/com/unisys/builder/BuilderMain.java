package com.unisys.builder;

import com.unisys.builder.machine.VendingMachineConfiguration;
import com.unisys.builder.machine.VendingMachineConfigurationBuilder;

public class BuilderMain {
    public static void main(String[] args) {
        VendingMachineConfiguration vendingMachineConfiguration = new VendingMachineConfigurationBuilder()
                .setCapacity(40)
                .setCode("123456789")
                .setContactPhoneNumber("555-237584")
                .setLanguageCode("ES")
                .setTemperature(5.5f)
                .setName("123456789")
                .build();
        System.out.println(vendingMachineConfiguration);
    }
}
