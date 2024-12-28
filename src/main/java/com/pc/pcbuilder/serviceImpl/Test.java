package com.pc.pcbuilder.serviceImpl;

import com.pc.pcbuilder.model.TestModel;
import com.pc.pcbuilder.repo.TestRepository;
import com.pc.pcbuilder.service.TestInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test implements TestInterface {


    TestRepository testRepository;

    Test(TestRepository testRepository){
        this.testRepository = testRepository;
    }

    int i =0;
    @Override
    public String display() {

        i++;
        System.out.println(i);
        return "Hello World"+i;
    }

    public TestModel save(TestModel obj){
        System.out.println(obj.getName());
        return testRepository.save(obj);
    }

    @Override
    public List<TestModel> getAllTests() {
        return (List<TestModel>) testRepository.findAll();
    }
}
