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

    private String brand;

    private String motherboardName;

    private String productCategory;

    private String motherboardSeries;

    private String formFactor;

    @JsonIgnore
    private String memorySlot;

    @JsonIgnore
    private String memoryType;

    private String socketType;

    private String chipset;
}
