package com.company;

public class Yummy {
    public static void main(String[] args){
        System.out.println("Hello");
        chocolate();
        System.out.println("Goodbye");
        ice_cream();
    }
    public static void chocolate(){
        System.out.println("yummy chocolate");
    }
    public static void ice_cream(){
        System.out.println("ice");
        chocolate();
        System.out.println("cream");
    }
}
