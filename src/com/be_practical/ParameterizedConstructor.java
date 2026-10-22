package com.be_practical;


class StudentInfo{
    int studentId;
    String studentName;

    StudentInfo(int id,String name){
        studentId = id;
        studentName = name;
    }

    public void getStudentInfo(){
        System.out.println("StudentId :"+studentId+" StudentName :"+studentName);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo(101,"Harsh");
        s1.getStudentInfo();
    }
}
