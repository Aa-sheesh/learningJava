import java.util.Scanner;

public class enhancedSwitch11 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What's the day bomie?");
        String day=sc.next();
        switch (day){
//            case "Monday" -> System.out.println("Weekday sadge!");
//            case "Tuesday" ->  System.out.println("Weekday sadge!");
//            case "Wednesday" ->  System.out.println("Weekday sadge!");
//            case "Thursday" ->  System.out.println("Weekday sadge!");
//            case "Friday" ->  System.out.println("Weekday sadge!");
            case "Monday","Tuesday","Wednesday","Thursday" -> System.out.println("Weekday sadge!");

            case "Saturday","Sunday" ->  System.out.println("Weekend lessgo!");
            case "Matterday" ->  System.out.println("What's the matter daddy?");
            default -> System.out.println(day+" is not a day brodigy.");
        }
        sc.close();
    }
}
