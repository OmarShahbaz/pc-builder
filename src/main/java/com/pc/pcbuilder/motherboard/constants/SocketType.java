package com.pc.pcbuilder.motherboard.constants;

import lombok.Getter;

@Getter
public enum SocketType {

    //intel
    LGA1700("Intel Core (12th Gen+)"),
    LGA1200("For Intel 10th & 11th Gen"),

    //amd
    AM4("AMD socket (Ryzen 1000-5000 series)"),
    AM5("Ryzen 7000 series+");

    private final String description;

    SocketType(String description){
        this.description = description;
    }
}
