package com.example.demo.interfacedemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZooController {

    @Autowired
    ZooService zooService;

    @GetMapping(value = "/getAnimals")
    public Zoo getAnimal()
    {
          return zooService.getAnimalFromZoo();
    }

    @PostMapping(value = "/setAnimals")
    public String setAnimal()
    {
        zooService.addAnimalsToZoo();
        return "success";
    }

}
