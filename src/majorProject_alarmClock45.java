import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;

public class majorProject_alarmClock45 {
    static void main(String[] args) {
//        DateTimeFormatter f=DateTimeFormatter.ofPattern("HH:mm:ss");
//        LocalTime time =LocalTime.now();
//        String timeRn=time.format(f);
//      System.out.printf("\rTime : %s",timeRn);
//
        Scanner sc=new Scanner(System.in);
        System.out.print("Set alarm(HH:mm:ss) :");
        String alarmTime=sc.nextLine();

        Thread timerTh=new Thread(new TimerThread(alarmTime));
        timerTh.setDaemon(true);
        timerTh.start();

        try {
            timerTh.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
