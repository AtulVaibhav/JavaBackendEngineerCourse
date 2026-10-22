package com.be_practical;


class Car{
    static String brand = "TataMotors";
}
public class StaticVariable {
    public static void main(String[] args) {
        // 1.Using className.varName (recommended)
        System.out.println(Car.brand);

        // 2.Using objectName
        Car car = new Car();
        Car car2 = new Car();
        //System.out.println(car.brand);

        car.brand = "Mahindra";
        System.out.println(car.brand);
        System.out.println(car2.brand);
    }
}
