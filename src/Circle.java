public class Circle extends Shape {
    int r=0;
    Circle(int r){
        this.r=r;
    }

    //abstract method needs to be implemented in non abstract classes
    @Override
    double area() {
        return Math.PI*r*r;
    }
    //Concrete methods are inherited directly and needn't be implemented
}
