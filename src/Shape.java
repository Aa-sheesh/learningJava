public abstract class Shape {
    //abstract functions cannot have a body ({})
    abstract double area();

    //Concrete methods needs to be inherited
    void display(){
        System.out.println("This is a shape");
    }
}
