package com.pc.pcbuilder.controller;

import com.pc.pcbuilder.model.TestModel;
import com.pc.pcbuilder.service.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    TestInterface testInterface;

    @GetMapping("/pcBuilder")
    String display(){
        return testInterface.display();
    }

    @PostMapping(value="/save")
    public ResponseEntity<TestModel> save(@RequestBody TestModel testModel) {
        return new ResponseEntity<TestModel>(testInterface.save(testModel), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<TestModel> getAll(){
        return testInterface.getAllTests();
    }
}
