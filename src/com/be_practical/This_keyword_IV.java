package com.be_practical;


class Book{
    Book(){
       // this(10);
        System.out.println("zero-arg constructor");
    }

    Book(int i){
        this();
        System.out.println("parameterized constructor");
    }
}
public class This_keyword_IV {
    public static void main(String[] args) {
        Book b = new Book(10);
    }
}
