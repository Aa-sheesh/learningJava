import java.util.Scanner;

public class enums42 {
    static void main(String[] args) {
        /*
            Enums = Enumerations = A special kind of class that represents a foxed set of constants
            They improve code readability and are easy to maintain
            More efficient with switches when comparing Strings
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String response = sc.nextLine().toUpperCase();
        Day day = Day.valueOf(response);
//        Day day=Day.SUNDAY;

//        System.out.println(day);
//        System.out.println(day.getDayNumber());

        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Its a weekday");
            case SATURDAY, SUNDAY -> System.out.println("Its a weekend");
            default -> System.out.println("Invalid date");
        }

    }
}
