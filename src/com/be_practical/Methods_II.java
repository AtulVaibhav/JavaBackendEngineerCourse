package com.be_practical;

public class Methods_II {

    // non-static: obj-reference
    public void m1(){
        System.out.println("non-static method called");
    }
    //static :className
    public static void m2(){
        System.out.println("static method called");
    }

    public static void main(String[] args) {
        Methods_II obj = new Methods_II();
        obj.m1();

        Methods_II.m2();

    }
}
