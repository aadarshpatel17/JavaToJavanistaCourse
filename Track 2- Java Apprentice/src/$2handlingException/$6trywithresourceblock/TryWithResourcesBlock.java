package $2handlingException.$6trywithresourceblock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesBlock {

    public static void main(String[] args) {
        /**
         *  using finally block for closing BufferedReader
         */

        BufferedReader br = null;
        try {
            String filepath = "C:\\Users\\Tony Stark\\Desktop\\Java Novice to Javanista\\Track 2- Java Apprentice\\src\\$2handlingexceptioninjava\\$6trywithresourceblock";
            File file = new File(filepath);
            br = new BufferedReader(new FileReader(file));
            String st = br.readLine();

            while(st != null) {
                System.out.println(st);
                st = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Exception caught: " + e);
        }
        finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Closed the buffered reader in the finally block.");
            }
            else {
                System.out.println("The buffered reader was never opened.");
            }
        }
    }

}
