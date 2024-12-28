package com.pc.pcbuilder.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="motherboard")
@Data // Lombok annotation to generate getters, setters, toString, etc.
public class Motherboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "type")
    private String motherboardType; //motherboard

    @Column(name = "series")
    private String motherboardSeries; //ATX, mATX, microATX

    @Column(name = "model")
    private String motherboardModel; //B760M-PLUS WIFI

    @Column(name = "memory_slot")
    private Integer motherboardMemorySlot; //4 or 2

    @Column(name = "memory_standard")
    private String motherboardMemoryStandard; //DDR5 or DDR4

    public Motherboard() {}

    public Motherboard(long id, String motherboardType, String motherboardSeries, String motherboardModel,
                       Integer motherboardMemorySlot, String motherboardMemoryStandard) {
        this.id = id;
        this.motherboardType = motherboardType;
        this.motherboardSeries = motherboardSeries;
        this.motherboardModel = motherboardModel;
        this.motherboardMemorySlot = motherboardMemorySlot;
        this.motherboardMemoryStandard = motherboardMemoryStandard;
    }

}
