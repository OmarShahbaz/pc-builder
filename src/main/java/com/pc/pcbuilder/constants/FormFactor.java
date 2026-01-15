package com.pc.pcbuilder.constants;

import lombok.Getter;

@Getter
public enum FormFactor {

    ATX("ATX"),
    MATX("mATX"),
    MICROATX("microATX"),
    EATX("EATX");

    private final String factor;

    FormFactor(String factor) {
        this.factor = factor;
    }
}
