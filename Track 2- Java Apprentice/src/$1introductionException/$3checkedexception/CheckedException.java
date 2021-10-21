package $1introductionException.$3checkedexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    /**
     *  If throws FileNotFoundException is in the method signature and catch
     *  block is in the method then,
     *      catch block will take precedence over throws.
     *
     *  Exception handler(try-catch) allows us to proceed with the code execution.
     */

    public static void main(String[] args) throws FileNotFoundException {

        String filepath = "C:\\Users\\Tony Stark\\Desktop\\Java Novice to Javanista\\Track 2- Java Apprentice\\src\\$1handlingerrors\\introductiontoexception\\$3checkedexception\\";

        try {
            FileReader file = new FileReader(filepath + "file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            System.out.println("\nCaught the exception!");
        }

        System.out.println("\nThe code execution is complete!");
    }

}
