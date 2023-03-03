package com.example.demo.interfacedemo;

import com.aerospike.mapper.annotations.AerospikeEmbed;
import com.aerospike.mapper.annotations.AerospikeKey;
import com.aerospike.mapper.annotations.AerospikeRecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@AerospikeRecord(namespace = "test",set = "zoo")
public class Zoo {

    @AerospikeKey
    int zooId;

    @AerospikeEmbed
    List<Animals> animalsList;
}
