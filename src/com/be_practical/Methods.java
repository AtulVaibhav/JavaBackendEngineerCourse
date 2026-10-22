package com.be_practical;


class Vehicle{
    public void m1(){
        System.out.println("m1() started");
        System.out.println("m1() completed");
    }
}
public class Methods {
    public static void main(String[] args) {
        System.out.println("main() started");
        Vehicle v = new Vehicle();
        v.m1();
        System.out.println("main() completed");
    }
}
