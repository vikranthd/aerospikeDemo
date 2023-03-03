package com.example.demo.interfacedemo;


import com.aerospike.client.AerospikeClient;
import com.aerospike.mapper.tools.AeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZooService {

    @Autowired
    AeroMapper aeroMapper;

    @Autowired
    AerospikeClient aerospikeClient;
    public void addAnimalsToZoo()
    {
        Cat cat1=new Cat("Persian","30");
        Cat cat2=new Cat("Muchkin","34");

        Zoo zoo=new Zoo();
        List<Animals> animalsList=new ArrayList<>();
        zoo.setAnimalsList(animalsList);

        zoo.setZooId(1);
        zoo.getAnimalsList().add(cat1);
        zoo.getAnimalsList().add(cat2);

        aeroMapper.save(zoo);
    }

    public Zoo getAnimalFromZoo()
    {

       return  aeroMapper.read(Zoo.class,1);
    }



}
