package com.example.demo.interfacedemo;


import com.aerospike.mapper.annotations.AerospikeRecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@AerospikeRecord(namespace = "test",set = "animals")
public class Animals {
    int id;
}
