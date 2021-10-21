package $2handlingException.$6trywithresourceblock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesBlockMain {

    public static void main(String[] args) {
        /**
         *  using finally block for closing BufferedReader.
         *
         *  Here, BufferedReader is a resources associated with try block and it will
         *      be closed automatically by Java, once the block is done.
         *  Any class which implements the java.lang.AutoClosable interface can be
         *      used in the TRY WITH RESOURCES block
         *  This is a shorthand to close down the resources when they are no longer
         *      required.
         *  We can also included multiple resources.
         */

        String filepath = "C:\\Users\\Tony Stark\\Desktop\\Java Novice to Javanista\\Track 2- Java Apprentice\\src\\$2handlingexceptioninjava\\$6trywithresourceblock";
        File file = new File(filepath);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String st = br.readLine();

            while(st != null) {
                System.out.println(st);
                st = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Catch and handle exception: " + e);
        }
    }

}
