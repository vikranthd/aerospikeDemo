package com.example.demo.interfacedemo;

import com.aerospike.mapper.annotations.AerospikeRecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@AerospikeRecord(shortName = "CAT")
public class Cat extends Animals{
    String breed;
    String lifeSpan;
}
