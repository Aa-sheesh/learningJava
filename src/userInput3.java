import java.util.Scanner;

public class userInput3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double s=sc.nextDouble();
        String name=sc.next(); //For First Name (reads no spaces)
        sc.nextLine();
        String name1=sc.nextLine(); //For Full Name (reads spaces)
        System.out.println("Int: "+n+"double: "+s+"First Name: "+name+ "Full Name: "+name1);

        sc.close(); // Important
    }
}
