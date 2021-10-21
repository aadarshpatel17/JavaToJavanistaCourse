package $2handlingException.$6trywithresourceblock;

import java.io.*;

public class TryWithResourcesBlockMultiple {
    /**
     * try with multiple resources-
     *      Copy content from one file to another file.
     */

    public static void main(String[] args) {

        String filepath = "C:\\Users\\Tony Stark\\Desktop\\Java Novice to Javanista\\Track 2- Java Apprentice\\src\\$2handlingexceptioninjava\\$6trywithresourceblock";
        File fileIn = new File(filepath + "\\file.txt");
        File fileOut = new File(filepath + "\\copyOfFile.txt");

        try(
                BufferedReader br = new BufferedReader(new FileReader(fileIn));
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
        ) {
            bw.write("This is another copy!");
            String st = null;

            while((st = br.readLine()) != null) {
                System.out.println(st);
                bw.write(st + "\n");
            }
        }
        catch(IOException e) {
            System.out.println("Catch and handle exception: " + e);
        }
    }

}
