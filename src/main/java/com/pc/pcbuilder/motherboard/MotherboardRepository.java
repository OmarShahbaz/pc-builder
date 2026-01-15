package com.pc.pcbuilder.motherboard;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherboardRepository extends CrudRepository<Motherboard, Long> {
}
