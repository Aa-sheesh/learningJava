public class abstraction27 {
    /*
        abstract = used to define classes and methods
            abstraction is the process of hiding implementation details and showing only essential features
            abstract classes can't be instantiated directly
            Can't contain 'abstract' methods(which must be implemented)
            Can contain 'concrete' methods (which are inherited)
     */
    static void main(String[] args) {
//        Shape shape = new Shape(); //'Shape' is abstract; cannot be instantiated
        Circle circle= new Circle(12);
        System.out.printf("%.2f\n",circle.area());
        circle.display();
    }
}
