import java.util.Scanner;

public class methods17 {


    static void main(String[] args) {
//        method = a block of reusable code that is executed when called ()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        generateFirstAndLastName(name);

        System.out.println("Enter 3 nos:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(add(a,b,c));
        sc.close();


    }
    //Method
    static void generateFirstAndLastName(String name) {
        System.out.println("Your first name is " + name.substring(0, name.indexOf(" ")));
        System.out.println("Your last name is " + (name.indexOf(" ") != -1 ? name.substring(name.indexOf(" ")) : "No last name"));
    }

    //Overloaded Methods
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
