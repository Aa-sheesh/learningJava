public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;
    Student(String name){
        this.name=name;

    }

    //Overloaded Constructors
    Student(String name,int age,double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
        isEnrolled=true;
    }
}
