import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimerThread implements Runnable{
    private final String alarmTime;

    private final File filePath=new File("./src/alarm.wav");

    TimerThread(String time){
        this.alarmTime=time;
    }


    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                DateTimeFormatter f=DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalTime time= LocalTime.now();
                String currTime=time.format(f);

                System.out.printf("\rTime : "+currTime );
//                System.out.println("\n");
                if(currTime.equals(alarmTime)){
                    AudioInputStream alarm= AudioSystem.getAudioInputStream(filePath);

                    Clip clip=AudioSystem.getClip();
                    clip.open(alarm);

                    Scanner sc=new Scanner(System.in);
                    String response="";

                    while(!response.equals("Q")){
                        clip.loop(99);
                        System.out.print("\nPress Q to stop");
                        response=sc.nextLine().toUpperCase();
                    }
                    clip.close();
                    sc.close();
                    break;
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException | UnsupportedAudioFileException | IOException e) {
                throw new RuntimeException(e);
            } catch (LineUnavailableException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
