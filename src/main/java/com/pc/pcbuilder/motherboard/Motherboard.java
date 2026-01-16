package com.pc.pcbuilder.motherboard;

import com.pc.pcbuilder.constants.*;
import com.pc.pcbuilder.motherboard.constants.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="motherboard")
public class Motherboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "launchDate")
    private Date launchDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "brand", nullable = false)
    private Brand brand;

    @Column(name = "model")
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private ProductCategory productCategory;

    @Column(name = "series")
    private String motherboardSeries;

    @Enumerated(EnumType.STRING)
    @Column(name = "formFactor", nullable = false)
    private FormFactor formFactor;

    @Column(name = "memorySlot", nullable = false)
    private MemorySlot memorySlot;

    @Column(name = "memoryStandard", nullable = false)
    private MemoryType memoryType;

    @Column(name = "socketType", nullable = false)
    private SocketType socketType;

    @Column(name = "chipset")
    private Chipset chipset;

}
