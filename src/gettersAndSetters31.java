public class gettersAndSetters31 {
    static void main(String[] args) {
        /*
            They help protect object data and add rules for accessing and modifying items
            Getters = Methods to make a field READABLE
            Setters = Methods to make a field WRITEABLE
         */
        Bike b=new Bike("Ducati","Red",10000);
        //Getters
        System.out.println(b.getModel());
        System.out.println(b.getColor());
        System.out.println(b.getPrice());
        //Setters
        b.setColor("Blue");
        System.out.println(b.getColor());
    }
}
