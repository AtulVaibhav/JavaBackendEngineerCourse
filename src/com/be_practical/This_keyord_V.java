package com.be_practical;


class DataInfo{
    int data = 20;
    public void m1(){
        int data = 30;
        System.out.println(data);
        System.out.println(this.data);
    }
}
public class This_keyord_V {
    public static void main(String[] args) {
        DataInfo dataInfo = new DataInfo();
        dataInfo.m1();
    }
}
