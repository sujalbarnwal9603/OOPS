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

public class OOPS{
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
}