package com.example.foodrestservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin("*")
public class apiController {

    @Autowired
    private RestTemplate restTemplate;

    private static String url="https://www.themealdb.com/api/json/v1/1/lookup.php?i=52772";

    @GetMapping("/food")
    public String getFood(){
        String food = restTemplate.getForObject(url,String.class);
        return food;

    }
}
