package com.pc.pcbuilder.serviceImpl;

import com.pc.pcbuilder.exception.ResourceNotFoundException;
import com.pc.pcbuilder.model.Motherboard;
import com.pc.pcbuilder.repo.MotherboardRepo;
import com.pc.pcbuilder.service.MotherboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotherboardServiceImpl implements MotherboardService {


    private final MotherboardRepo motherboardRepo;

    @Autowired
    public MotherboardServiceImpl(MotherboardRepo motherboardRepo){ //constructor dependency injection
        this.motherboardRepo = motherboardRepo;
    }

    @Override
    public List<Motherboard> fetchAllMotherboards() {
        return (List<Motherboard>) motherboardRepo.findAll();

    }

    @Override
    public Motherboard addMotherboard(Motherboard newMotherboard) {
        Motherboard motherboard = new Motherboard(newMotherboard.getId(), newMotherboard.getMotherboardType(), newMotherboard.getMotherboardSeries(),
                newMotherboard.getMotherboardModel(), newMotherboard.getMotherboardMemorySlot(), newMotherboard.getMotherboardMemoryStandard());
        return motherboardRepo.save(motherboard);
    }

    @Override
    public Motherboard updateMotherboard(Long id, Motherboard updatedMotherboard) {
        return motherboardRepo.findById(id)
                .map(existingMotherboard -> {
                    existingMotherboard.setMotherboardType(updatedMotherboard.getMotherboardType());
                    existingMotherboard.setMotherboardSeries(updatedMotherboard.getMotherboardSeries());
                    existingMotherboard.setMotherboardModel(updatedMotherboard.getMotherboardModel());
                    existingMotherboard.setMotherboardMemorySlot(updatedMotherboard.getMotherboardMemorySlot());
                    existingMotherboard.setMotherboardMemoryStandard(updatedMotherboard.getMotherboardMemoryStandard());
                    return motherboardRepo.save(existingMotherboard);
                })
//                .orElseThrow(() -> new ResourceNotFoundException("Motherboard not found with id: " + id));
                .orElseThrow(() -> new ResourceNotFoundException("Motherboard","id", id));
    }

    @Override
    public void removeMotherboard(Long id) {
        motherboardRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Motherboard not found with id: " + id));
        motherboardRepo.deleteById(id);
    }
}
