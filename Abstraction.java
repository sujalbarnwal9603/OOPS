// abstract is such that it exist but we don't need it or use it
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("You are creating a Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs"); 
    }
}

public class Abstraction {
    public static void main(String args[]){
        Horse horse = new Horse();
        
    }
}
