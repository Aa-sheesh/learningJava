public class interface28 {
    /*
        Interface = A blueprint for a class that specifies a set of abstract methods that implementing classes MUST define
            Supports multiple-inheritance like behaviour
     */

    //Checkout [Prey and Predator] and [Hawk,Rabbit and Fishclasses] interfaces to know more
    static void main(String[] args) {

        Rabbit rabbit=new Rabbit();
        rabbit.flee();
        Hawk hawk=new Hawk();
        hawk.hunt();

        Fish fish=new Fish();
        fish.hunt();
        fish.flee();
    }

}
