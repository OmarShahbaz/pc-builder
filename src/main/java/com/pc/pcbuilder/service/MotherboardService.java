package com.pc.pcbuilder.service;

import com.pc.pcbuilder.model.Motherboard;

import java.util.List;

/*
 *
 * Get all Motherboard
 * Save Motherboard
 * Update Motherboard
 * Remove Motherboard
 * */
public interface MotherboardService{
    List<Motherboard> fetchAllMotherboards();
    Motherboard addMotherboard(Motherboard motherboard);
    Motherboard updateMotherboard(Long id, Motherboard updatedMotherboard);
    void removeMotherboard(Long id);


}