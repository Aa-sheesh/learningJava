import java.util.Scanner;

public class runtimePolymorphism30 {
    static void main(String[] args) {
        /*
            Runtime polymorphism = when the method that gets executed is decided at runtime based in the actual type of the object
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Would you like a cat or a dog(1=dog,2=cat)?");
        int option=sc.nextInt();
        switch (option){
            case 1:
                Dog dog=new Dog(12);
                dog.speak();
                break;
            case 2:
                Cat cat=new Cat(12);
                cat.speak();
                break;
            default : System.out.println("Not a valid choice.");
        }
        sc.close();
    }
}
