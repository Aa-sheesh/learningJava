import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateTime38 {

    static void main(String[] args) {
        /*
            How to work with dates and times using Java -
            LocalDate, LocalTime, LocalDateTime , UTC Timestamp

         */
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalTime time= LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
        Instant instant= Instant.now();
        System.out.println(instant);

        //Custom Format
        LocalDateTime dateTime1=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy\nHH:mm:ss");
        String customDateTime=dateTime1.format(formatter);
        System.out.println(customDateTime);

//        Custom Date TIme object
        LocalDate date1=LocalDate.of(2024,12,25);
        System.out.println(date1);
        LocalDateTime localDateTime1=LocalDateTime.of(2025,12,25,12,0,0);
        LocalDateTime localDateTime2=LocalDateTime.of(2025,11,25,12,0,0);
        System.out.println(localDateTime1);

        //Date methods
        if(localDateTime1.isBefore(localDateTime2)){
            System.out.println(localDateTime1+" is before "+localDateTime2);
        } else if (localDateTime1.isAfter(localDateTime2)) {
            System.out.println(localDateTime1+" is after "+localDateTime2);
        }else if(localDateTime1.isEqual(localDateTime2)){
            System.out.println(localDateTime1+ "="+ localDateTime2);
        }else{
            System.out.println("I don't know.");
        }
    }
}
