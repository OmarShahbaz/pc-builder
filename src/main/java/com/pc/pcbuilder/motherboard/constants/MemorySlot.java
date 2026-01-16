package com.pc.pcbuilder.motherboard.constants;

import lombok.Getter;

@Getter
public enum MemorySlot {

    TWO(2), FOUR(4);

    private final int slot;

    MemorySlot(int slot){
        this.slot = slot;
    }
}
