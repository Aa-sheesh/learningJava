import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class miniProject_musicPlayer38 {
    static void main(String[] args) {
        //How to play audio with (.wavm,.au,.aiff)
        String filePath="./src/alarm.wav";
        File file=new File(filePath);

        try(    Scanner sc=new Scanner(System.in);
                AudioInputStream audioStream= AudioSystem.getAudioInputStream(file)
        ){

            Clip clip=AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            String response="";
            while(!response.equals("Q")){
                System.out.println(" P = Play, R = Reset, S= Stop, Q = Quit");


                response=sc.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S"-> clip.stop();
                    case "R"->clip.setMicrosecondPosition(0);
                    case "Q"-> clip.close();
                    default -> System.out.println("Invalid choice");
                }

            }

        }catch (IOException e){
            System.out.println("Something went wrong! " + e);
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio type " +e);
        } catch (LineUnavailableException e) {
            System.out.println("Unavailable" + e);
        }catch (Exception e){
            System.out.println("Error : "+e);
        }finally{
            System.out.println("Bye!");
        }
    }
}
