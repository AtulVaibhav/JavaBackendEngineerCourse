package com.be_practical;


import java.util.Objects;

class Student{
   int studentId;
   public void setStuentId(int studentId){
       this.studentId = studentId;
   }
   public int getStudentId(){
       return this.studentId;
   }

   // override equals():Object
    @Override
    public boolean equals(Object obj){
       if(this==obj) return true;
       if(obj==null || getClass()!= obj.getClass()) return false;

       Student other = (Student) obj;
       return this.studentId == other.studentId;
    }

    // override hashCode()
    @Override
    public int hashCode(){
       return Objects.hash(studentId);
    }
}
public class Test1 {
    public static void main(String[] args) {
        // ClassType objName = new ClassType();
        Student s1  = new Student();
        System.out.println(s1.getClass());
       // System.out.println(s1);// com.be_practical.Student@hexacode
        s1.setStuentId(101);
        Student s2 = new Student();
        s2.setStuentId(101);

        System.out.println(s1.getStudentId());
        System.out.println(s2.getStudentId());

        if(s1.equals(s2)){
            System.out.println("Same object");
        }else{
            System.out.println("Different objects");
        }

        if(s1==s2){
            System.out.println("Same object");
        }else{
            System.out.println("Different objects");
        }
    }
}
