package com.example.demo.interfacedemo;

public class MainClass {

    public static void main(String[] args) {
        ZooService zooService =new ZooService();

        Cat cat1=new Cat("Persian","30");
        Cat cat2=new Cat("Muchkin","34");

        System.out.println(zooService.getAnimalFromZoo());
    }
}
