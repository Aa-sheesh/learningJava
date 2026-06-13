import java.util.Scanner;

public class ternaryOperator10 {
    static void main(String[] args) {
        /*
            ternary operator : (condition)?ifTrue:ifFalse;
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to play this game?(Y/N)");
        char ans=sc.next().charAt(0);
        if(ans=='Y'){
            System.out.println("Welcome to the game!");
        }else{
            System.out.println("Ok");
        }

        sc.close();

    }
}
