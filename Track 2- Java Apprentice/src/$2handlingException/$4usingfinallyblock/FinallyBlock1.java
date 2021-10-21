package $2handlingException.$4usingfinallyblock;

import java.io.*;

public class FinallyBlock1 {

    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            String filepath = "C:\\Users\\Tony Stark\\Desktop\\Java Novice to Javanista\\Track 2- Java Apprentice\\src\\$2handlingexceptioninjava\\$4usingfinallyblock\\file.txt";
            File file = new File(filepath);
            br = new BufferedReader(new FileReader(file));
            String st = br.readLine();
            while(st != null) {
                System.out.println(st);
                st = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Exception caught: \n" + e);
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
