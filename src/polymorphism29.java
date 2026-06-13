public class polymorphism29 {
    /*
        POLY = MANY, MORPH = "SHAPE
        Objects can identify as other objects.
        Objects can be treated as objects of a common superclass
     */
    static void main(String[] args) {
        Train tr=new Train();
        Boat bt=new Boat();

//        tr.go();
//        bt.go();

        Vehicle[] vehicles={tr,bt};
        for(Vehicle veh:vehicles){
            veh.go();
        }
    }
}
