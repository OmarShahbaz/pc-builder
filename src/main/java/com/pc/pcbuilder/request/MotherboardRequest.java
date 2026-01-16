package com.pc.pcbuilder.request;

import com.pc.pcbuilder.constants.*;

import com.pc.pcbuilder.motherboard.constants.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class MotherboardRequest {

    @NotNull(message = "Field is required")
    private Date launchDate;

    @NotNull(message = "Field is required")
    private Brand brand;

    @NotNull(message = "Field is required")
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String model;

    @NotNull(message = "Field is required")
    private ProductCategory productCategory;

    @NotNull(message = "Field is required")
    private String motherboardSeries;

    @NotNull(message = "Field is required")
    private FormFactor formFactor;

    @NotNull(message = "Field is required")
    private MemorySlot memorySlot;

    @NotNull(message = "Field is required")
    private MemoryType memoryType;

    @NotNull(message = "Field is required")
    private SocketType socketType;

    @NotNull(message = "Field is required")
    private Chipset chipset;

}
