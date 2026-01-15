package com.pc.pcbuilder.constants;

public enum ProductCategory {

    MOUSE("Mouse"),
    KEYBOARD("Keyboard"),
    MONITOR("Monitor"),
    MOTHERBOARD("Motherboard"),
    CPU("Processor"),
    GPU("Graphics Card"),
    RAM("RAM"),
    SSD("SSD"),
    HDD("Hard Drive"),
    POWER_SUPPLY("Power Supply"),
    CASE("PC Case"),
    COOLER("Air Cooler"),
    AIO_COOLER("AIO Cooler"),
    HEADSET("Headset"),
    WEBCAM("Webcam"),
    MICROPHONE("Microphone"),
    LAPTOP("Laptop"),
    PRINTER("Printer"),
    ROUTER("Router"),
    UPS("UPS"),
    ACCESSORY("Accessory");

    private final String displayName;

    ProductCategory(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
