package com.be_practical;


class Employee{
    int empId = 101; // instance
}
public class InstanceVariable {
    public static void main(String[] args) {
      Employee e1 = new Employee();
        System.out.println(e1.empId);
        Employee e2 = new Employee();
        System.out.println(e2.empId);

        e1.empId = 102;
        System.out.println(e1.empId);
        System.out.println(e2.empId);
    }
}
