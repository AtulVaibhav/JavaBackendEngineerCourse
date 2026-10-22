package com.be_practical;

// Singleton design pattern : Creational Design Pattern
class Pen{
   private static Pen pen = null;
    private Pen(){}

    public static Pen getInstance(){
        if(pen==null){
            pen = new Pen();
        }
        return pen;
    }

    public void writeTask(){
        System.out.println("writing operation");
    }
}
public class Constructor_II {
    public static void main(String[] args) {
//       Pen p = new Pen();

        Pen p = Pen.getInstance();
        Pen p1 = Pen.getInstance();

        if(p==p1){
            System.out.println("Points to same object");
        }else{
            System.out.println("points to different objects");
        }
         p.writeTask();
    }
}
