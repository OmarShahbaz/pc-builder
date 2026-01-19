package com.pc.pcbuilder.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pc.pcbuilder.constants.*;

import com.pc.pcbuilder.motherboard.constants.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MotherboardRequest {

    @NotNull(message = "Field is required")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date launchDate;

    @NotNull(message = "Brand is required")
    private Brand brand;

    @NotNull(message = "Name is required")
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String motherboardName;

    @NotNull(message = "productCategory is required")
    private ProductCategory productCategory;

    @NotNull(message = "motherboardSeries is required")
    private String motherboardSeries;

    @NotNull(message = "formFactor is required")
    private FormFactor formFactor;

    @NotNull(message = "memorySlot is required")
    private MemorySlot memorySlot;

    @NotNull(message = "memoryType is required")
    private MemoryType memoryType;

    @NotNull(message = "socketType is required")
    private SocketType socketType;

    @NotNull(message = "chipset is required")
    private Chipset chipset;

}
