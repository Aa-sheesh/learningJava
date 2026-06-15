import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class writingAndReadingFiles37 {
    /*
        Writing into a file:
        1. FileWriter = Good for small or medium sized text files
        2. BufferedWriter = Better performance for large amounts of text
        3. PrintWriter = Best for structured data, like reports or logs
        4. FileOutputStream = Best for binary files(eq- images,audiofiles)
     */
    static void main(String[] args) {
    String filePath = "./src/test.txt";
//        try(FileWriter wr=new FileWriter(filePath)){
//            wr.write("""
//Hi, I am Aashish Singh.
//Anddddd, I am the best ever!
//                    """);
//        }catch (java.io.IOException e){
//            System.out.println("IO Problem "+e);
//        }catch(Exception e){
//            System.out.println("Something went wrong : "+ e);
//        }finally {
//            System.out.println("Added contents to "+filePath);
//        }


    /*
        Reading a file:
        1. BufferedReader + FileReader = Best for reading text files line by line
        2. FileInputStream = best for binary files ( eg Images audio files)
        3. RandomAccessFile = Best for read/write specific portions of a large file
     */
//        try(
//    BufferedReader r = new BufferedReader(new FileReader(filePath)))
//    {
//        String line;
//        while((line=r.readLine())!=null){
//            System.out.println(line);
//        }
//
//    }catch(
//    FileNotFoundException e)
//
//    {
//        System.out.println("File not found " + e);
//    }catch(
//    Exception e)
//
//    {
//        System.out.println("Error : " + e);
//    }

}
}
