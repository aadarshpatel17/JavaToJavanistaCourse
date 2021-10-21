package $2handlingException.$4usingfinallyblock;

import java.io.*;

public class FinallyBlock {

    /**
     *  finally block -
     *      -   Included at the end of the try-catch block.
     *      -   It will be executed whether or not an exception is thrown.
     *      -   We can also skip catch block.
     */

    public static void main(String[] args) {

        String filepath = "C:\\Users\\Tony Stark\\Desktop\\Java Novice to Javanista\\Track 2- Java Apprentice\\src\\$2handlingexceptioninjava\\$4usingfinallyblock\\file.txt";

        File file = new File(filepath);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String st = null;
        try {
            st = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(st != null) {
            System.out.println(st);

            try {
                st = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        System.out.println("\nThe code execution is complete!");
    }

}
