package com.pc.pcbuilder.repo;

import com.pc.pcbuilder.model.TestModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<TestModel, Long> {
}
