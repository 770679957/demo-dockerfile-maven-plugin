package com.example.dockerfilemavenplugin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "api")
public class TestController {

    // http://127.0.0.1:8080/api/getTest
    @RequestMapping(value = "/getTest",method = RequestMethod.GET)
    public List<String> getTest(){
        List<String> stringA = Arrays.asList("hello", "world","A");
        return stringA;
    }
}
