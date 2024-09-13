// package OOPS;

class Pen{
    String color;
    String type;    //ballpoint gel

    public void write(){
        System.out.println("writting something");
    }

    public void printCOlor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String[] args){
       /**Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";


        pen1.printCOlor();

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "well";
        pen2.printCOlor();

         */ 


         Student s1 = new Student();
         s1.name = "mullah";
         s1.age = 23;
         s1.printInfo();

    }
}
