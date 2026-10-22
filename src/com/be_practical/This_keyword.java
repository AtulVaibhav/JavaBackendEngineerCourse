package com.be_practical;


class Product{
    Product(){
        System.out.println("current Value of this :"+this);
    }
}
public class This_keyword {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println("value of p1 :"+p1);

        Product p2 = new Product();
        System.out.println("value of p2 :"+p2);
    }
}
