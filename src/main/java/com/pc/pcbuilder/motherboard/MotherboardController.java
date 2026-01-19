package com.pc.pcbuilder.motherboard;

import com.pc.pcbuilder.request.MotherboardRequest;
import com.pc.pcbuilder.response.MotherboardResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/v1/motherboard")
public class MotherboardController {

    private final MotherboardService motherboardService;

    MotherboardController(MotherboardService motherboardService){
        this.motherboardService = motherboardService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<MotherboardResponse>> getAllMotherboards(){
        return ResponseEntity.ok(motherboardService.getAllMotherboards());
    }

    @PostMapping("/add")
    public ResponseEntity<MotherboardResponse> addMotherboard(@Valid @RequestBody MotherboardRequest motherboardRequest){
        MotherboardResponse motherboardResponse = motherboardService.addMotherboard(motherboardRequest);
        return ResponseEntity.ok(motherboardResponse);
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
