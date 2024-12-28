package com.pc.pcbuilder.service;


import com.pc.pcbuilder.model.TestModel;

import java.util.List;


public interface TestInterface {

    String display();

    TestModel save(TestModel testModel);
    List<TestModel> getAllTests();
}
