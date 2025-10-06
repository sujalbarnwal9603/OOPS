interface Animal{
    int eyes=2; // final and static by default
    void walk();
}

interface Herbivore{

}

class Horse implements Animal, Herbivore{ // multiple inheritance
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class Interface {
    public static void main(String args[]){
        Horse horse= new Horse();
        horse.walk();
    }
}
