class Student{
    String name;
    static String school; // static variable same for all the objects

    public static void changeSchool(){ // static method
        school="New School";
    }
}



public class StaticKeyword {
    public static void main(String args[]){
        Student.school="JMV"; // static variable can be accessed without creating object
        Student student1= new Student();
        student1.name="Corelshark";
        System.out.println(student1.name);
        System.out.println(student1.school); // can be accessed by object also but not recommended
    }   
}
