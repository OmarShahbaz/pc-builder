package com.pc.pcbuilder.motherboard;


import com.pc.pcbuilder.mapper.MotherboardMapper;
import com.pc.pcbuilder.request.MotherboardRequest;
import com.pc.pcbuilder.response.MotherboardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
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

    public List<MotherboardResponse> getAllMotherboards() {

        List<Motherboard> motherboards = new ArrayList<>();

        Iterable<Motherboard> motherboardIterable = motherboardRepo.findAll();
        Iterator<Motherboard> iterator = motherboardIterable.iterator();
        while (iterator.hasNext()){
            motherboards.add(iterator.next());
        }

        List<MotherboardResponse> motherboardResponses = motherboards.stream()
                .map(m -> mapper.toResponse(m))
                .toList();

        return motherboardResponses;

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
