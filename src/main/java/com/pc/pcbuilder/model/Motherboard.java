package com.pc.pcbuilder.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="motherboard")
public class Motherboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "releaseDate")
    private String dateFirstAvailable;

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

    @Column(name = "cpu_socket_type")
    private String cpuSocketType; //AM5 or intel

    @Column(name = "chipset")
    private String chipset; //Intel® Z790 Chipset or AMD B850

    public Motherboard() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDateFirstAvailable() {
        return dateFirstAvailable;
    }

    public void setDateFirstAvailable(String dateFirstAvailable) {
        this.dateFirstAvailable = dateFirstAvailable;
    }

    public String getMotherboardType() {
        return motherboardType;
    }

    public void setMotherboardType(String motherboardType) {
        this.motherboardType = motherboardType;
    }

    public String getMotherboardSeries() {
        return motherboardSeries;
    }

    public void setMotherboardSeries(String motherboardSeries) {
        this.motherboardSeries = motherboardSeries;
    }

    public String getMotherboardModel() {
        return motherboardModel;
    }

    public void setMotherboardModel(String motherboardModel) {
        this.motherboardModel = motherboardModel;
    }

    public Integer getMotherboardMemorySlot() {
        return motherboardMemorySlot;
    }

    public void setMotherboardMemorySlot(Integer motherboardMemorySlot) {
        this.motherboardMemorySlot = motherboardMemorySlot;
    }

    public String getMotherboardMemoryStandard() {
        return motherboardMemoryStandard;
    }

    public void setMotherboardMemoryStandard(String motherboardMemoryStandard) {
        this.motherboardMemoryStandard = motherboardMemoryStandard;
    }

    public String getCpuSocketType() {
        return cpuSocketType;
    }

    public void setCpuSocketType(String cpuSocketType) {
        this.cpuSocketType = cpuSocketType;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

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
