package com.pc.pcbuilder.repo;

import com.pc.pcbuilder.model.Motherboard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherboardRepo extends CrudRepository<Motherboard, Long> {
}
