package com.pc.pcbuilder.constants;

public enum Brand {

    // CPU / GPU
    INTEL("Intel"),
    AMD("AMD"),
    NVIDIA("NVIDIA"),

    // Motherboards & Components
    ASUS("ASUS"),
    MSI("MSI"),
    GIGABYTE("Gigabyte"),
    ASROCK("ASRock"),
    BIOSTAR("Biostar"),

    // Memory & Storage
    CORSAIR("Corsair"),
    GSKILL("G.Skill"),
    KINGSTON("Kingston"),
    CRUCIAL("Crucial"),
    SAMSUNG("Samsung"),
    WESTERN_DIGITAL("Western Digital"),
    SEAGATE("Seagate"),

    // Power & Cooling
    COOLER_MASTER("Cooler Master"),
    THERMALTAKE("Thermaltake"),
    EVGA("EVGA"),
    SEASONIC("Seasonic"),
    NZXT("NZXT"),
    DEEPCOOL("DeepCool"),

    // Peripherals
    LOGITECH("Logitech"),
    RAZER("Razer"),
    STEELSERIES("SteelSeries"),
    HYPERX("HyperX"),
    REDRAGON("Redragon"),

    // Displays
    LG("LG"),
    DELL("Dell"),
    ACER("Acer"),
    BENQ("BenQ"),
    AOC("AOC"),
    VIEWSONIC("ViewSonic"),

    // OEM / Laptops
    HP("HP"),
    LENOVO("Lenovo"),
    ALIENWARE("Alienware"),
    APPLE("Apple"),

    // Networking
    TP_LINK("TP-Link"),
    NETGEAR("Netgear"),

    // Fallback
    GENERIC("Generic");

    private final String displayName;

    Brand(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
