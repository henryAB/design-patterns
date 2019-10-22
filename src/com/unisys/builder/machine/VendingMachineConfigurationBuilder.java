package com.unisys.builder.machine;

public class VendingMachineConfigurationBuilder {

    private String name;
    private String code;
    private float temperature;
    private int capacity;
    private String languageCode;
    private String contactPhoneNumber;

    public VendingMachineConfigurationBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public VendingMachineConfigurationBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public VendingMachineConfigurationBuilder setTemperature(float temperature) {
        this.temperature = temperature;
        return this;
    }

    public VendingMachineConfigurationBuilder setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public VendingMachineConfigurationBuilder setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public VendingMachineConfigurationBuilder setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
        return this;
    }

    public VendingMachineConfiguration build() {
        return new VendingMachineConfiguration(name, code, temperature, capacity, languageCode, contactPhoneNumber);
    }
}
