package com.pc.pcbuilder.motherboard;

import com.pc.pcbuilder.request.MotherboardRequest;
import com.pc.pcbuilder.response.MotherboardResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("v1/motherboard")
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
    public MotherboardResponse insertMotherboard(@RequestBody MotherboardRequest motherboardRequest){
        return motherboardService.addMotherboard(motherboardRequest);
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
