package com.pc.pcbuilder.constants;

public enum Brand {

    INTEL("Intel"),
    AMD("AMD"),
    NVIDIA("NVIDIA"),
    ASUS("ASUS"),
    MSI("MSI"),
    GIGABYTE("Gigabyte"),
    ASROCK("ASRock"),
    BIOSTAR("Biostar"),
    CORSAIR("Corsair"),
    GSKILL("G.Skill"),
    KINGSTON("Kingston"),
    CRUCIAL("Crucial"),
    SAMSUNG("Samsung"),
    WESTERN_DIGITAL("Western Digital"),
    SEAGATE("Seagate"),
    COOLER_MASTER("Cooler Master"),
    THERMALTAKE("Thermaltake"),
    EVGA("EVGA"),
    SEASONIC("Seasonic"),
    NZXT("NZXT"),
    DEEPCOOL("DeepCool"),
    LOGITECH("Logitech"),
    RAZER("Razer"),
    STEELSERIES("SteelSeries"),
    HYPERX("HyperX"),
    REDRAGON("Redragon"),
    LG("LG"),
    DELL("Dell"),
    ACER("Acer"),
    BENQ("BenQ"),
    AOC("AOC"),
    VIEWSONIC("ViewSonic"),
    HP("HP"),
    LENOVO("Lenovo"),
    ALIENWARE("Alienware"),
    APPLE("Apple"),
    TP_LINK("TP-Link"),
    NETGEAR("Netgear"),
    OTHER("OTHER");

    private final String displayName;

    Brand(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
