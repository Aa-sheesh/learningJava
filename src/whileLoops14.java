import java.util.Scanner;

public class whileLoops14 {
    static void main(String[] args) {
        /*
            while loops = run same shit till condition true
         */
        Scanner sc=new Scanner(System.in);
        /*
        While Loop
        String response=" ";
        while(!response.equals("Q")){
            System.out.println("You are playing a game, press Q to quit:");
            response=sc.next().toUpperCase();
        }
        sc.close();
        System.out.println("You have quit the game.");
        */

        //Do while
        int age =0;
        do{
            System.out.println("Enter your age:");
            age=sc.nextInt();
        }while(age<0);
        System.out.println("Your age is "+age+". Damn, start a family already. ");
        sc.close();
    }
}
