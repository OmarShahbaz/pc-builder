package com.pc.pcbuilder.controller;

import com.pc.pcbuilder.model.Motherboard;
import com.pc.pcbuilder.service.MotherboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/motherboard")
public class MotherboardController {

    private final MotherboardService motherboardService;

    MotherboardController(MotherboardService motherboardService){
        this.motherboardService = motherboardService;
    }

    @GetMapping(value = "/all")
    public List<Motherboard> getAllMotherboards(){
        return motherboardService.fetchAllMotherboards();
    }

    @PostMapping("/add")
    public Motherboard insertMotherboard(@RequestBody Motherboard newMotherboard){
        return motherboardService.addMotherboard(newMotherboard);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Motherboard> updateMotherboard(@PathVariable Long id, @RequestBody Motherboard updatedMotherboard){
        Motherboard motherboard = motherboardService.updateMotherboard(id, updatedMotherboard);
        return ResponseEntity.ok(motherboard);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> removeMotherboard(@PathVariable Long id){
        motherboardService.removeMotherboard(id);
        return ResponseEntity.noContent().build();
    }

}
