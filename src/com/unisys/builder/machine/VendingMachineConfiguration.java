package com.unisys.builder.machine;

public class VendingMachineConfiguration {

    private final String name;
    private final String code;
    private final float temperature;
    private final int capacity;
    private final String languageCode;
    private final String contactPhoneNumber;

    public VendingMachineConfiguration(String name, String code, float temperature, int capacity, String languageCode, String contactPhoneNumber) {
        this.name = name;
        this.code = code;
        this.temperature = temperature;
        this.capacity = capacity;
        this.languageCode = languageCode;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    @Override
    public String toString() {
        return "VendingMachineConfiguration{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", temperature=" + temperature +
                ", capacity=" + capacity +
                ", languageCode='" + languageCode + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                '}';
    }
}
