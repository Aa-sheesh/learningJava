public class inheritance24 {
    static void main(String[] args) {
        /*
            Inheritance = one class inherits attributes and methods from another class
         */
        Cat cat=new Cat(12);
        cat.roar();
        System.out.println(cat.age);
        /*
        super keyword - refers to the parent class (subclass <- superclass)
            Used in constructors and method overriding
            Calls the parent constructor to initialise attributes

            Ex - go to Cat class to check out super usage
         */

    }
}
