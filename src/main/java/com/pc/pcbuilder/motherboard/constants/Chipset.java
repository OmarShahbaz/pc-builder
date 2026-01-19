package com.pc.pcbuilder.motherboard.constants;

import lombok.Getter;

@Getter
public enum Chipset {
    Z790("Z790");

    private final String chipset;

    Chipset(String chipset) {
        this.chipset = chipset;
    }
}
