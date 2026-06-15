import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling36 {
    static void main(String[] args) {
        /*
            Exception = An event that interrupts normal flow of a program(dividing by zero, file not found, mismatch input type)
            Surround any dangerous code with a try{} block - try{}catch{}finally{} / try(){}catch{}
         */
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a dividend");
            int a = sc.nextInt();
            System.out.println("Enter a dividend");
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println("Enter a number.");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero.");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("This always executes");
        }

    }
}
