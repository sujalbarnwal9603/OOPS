// corelshark@sujal-Corel:~/My-Resources/OOPS$ javac OOPS.java
// corelshark@sujal-Corel:~/My-Resources/OOPS$ java OOPS

class Pen{
    // properties
    String color; // blue, black, green
    String type; // ballpoint, gel, fountain


    //function that are in class are called methods
    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
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

    /* 
    // non-parameterized constructor
    Student(){
        System.out.println("Constructor called...");
    }
    */

    /*
    // parameterized constructor
    Student(String name, int age){
        this.name=name;
        this.age=age;

    }

    */


    // copy constructor

    Student (){
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
}

public class OOPS{

    /*
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        pen1.printColor();
        // System.out.println(pen1.color);

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen2.write();
        pen2.printColor();
    }

     */

    public static void main(String args[]){

        // new keyword by writting it generate a mempory in heap for that s1 object
        
       /*  
    //  Student s1=new Student(); //non-parameterized constructor
        s1.name="Sujal";
        s1.age=20;
       */

        /*
        Student s1=new Student("Sujal", 20);  //parameterized constructor
        */

        
        Student s1=new Student();
        s1.name="Sujal";
        s1.age=20;
        Student s2=new Student(s1); // copy constructor
        s2.printInfo();
    }

}