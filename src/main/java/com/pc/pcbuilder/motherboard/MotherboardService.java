package com.pc.pcbuilder.motherboard;


import com.pc.pcbuilder.mapper.MotherboardMapper;
import com.pc.pcbuilder.request.MotherboardRequest;
import com.pc.pcbuilder.response.MotherboardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotherboardService {


    private final MotherboardRepository motherboardRepo;
    private final MotherboardMapper mapper;

    @Autowired
    public MotherboardService(MotherboardRepository motherboardRepo, MotherboardMapper mapper){
        this.motherboardRepo = motherboardRepo;
        this.mapper = mapper;
    }

    public List<Motherboard> fetchAllMotherboards() {
        return (List<Motherboard>) motherboardRepo.findAll();

    }

    public MotherboardResponse addMotherboard(MotherboardRequest motherboardRequest) {
        Motherboard entity = mapper.toEntity(motherboardRequest);
        Motherboard saved = motherboardRepo.save(entity);
        return mapper.toResponse(saved);
    }

    public Motherboard updateMotherboard(Long id, Motherboard updatedMotherboard) {
        return null;
    }

    public void removeMotherboard(Long id) {
    }
}
