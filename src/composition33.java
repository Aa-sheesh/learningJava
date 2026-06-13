public class composition33 {
    /*
        Composition = represents a 'part-of ' relationship between objects
            Ex- an engine is a part of the car
            Allows complex objects to be constructed from smaller objects.
     */
    static void main(String[] args) {
        Car1 car=new Car1("Corvette",2025,"V8");
        System.out.println(car.engine.type);

        car.start();

    }

}
