package com.example.demo.config;

import com.aerospike.client.AerospikeClient;
import com.aerospike.mapper.tools.AeroMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AerospikeConfig {

    @Value("${aerospike.hostname}")
    public String hostname;

    @Value("${aerospike.port}")
    public int port;


    @Bean
    public AerospikeClient generateAerospikeClient()
    {
      return  new AerospikeClient(hostname,port);
    }

    @Bean
    public  AeroMapper generateAeroMapper(){

        return new AeroMapper.Builder(generateAerospikeClient()).build();
    }



}
