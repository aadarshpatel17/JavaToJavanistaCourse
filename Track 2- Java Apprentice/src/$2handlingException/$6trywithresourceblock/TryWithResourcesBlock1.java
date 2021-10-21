package $2handlingException.$6trywithresourceblock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesBlock1 {

    public static void main(String[] args) throws IOException {
        /**
         *  using finally block for closing BufferedReader.
         *  there is no exception handling here.
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
        finally {
            br.close();
            System.out.println("Closed the buffered reader in the finally block.");
        }
    }

}
