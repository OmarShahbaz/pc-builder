package com.pc.pcbuilder.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pc.pcbuilder.constants.*;
import com.pc.pcbuilder.motherboard.constants.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MotherboardResponse {

    @JsonIgnore
    private Date launchDate;

    private Brand brand;

    private String model;

    private ProductCategory productCategory;

    private String motherboardSeries;

    private FormFactor formFactor;

    @JsonIgnore
    private MemorySlot memorySlot;

    @JsonIgnore
    private MemoryType memoryType;


    private SocketType socketType;

    private Chipset chipset;
}
