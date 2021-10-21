package $1introductionException.$3checkedexception;

import java.io.*;

public class CheckedException1 {

    public static void main(String[] args) {

        String filepath = "C:\\Users\\Tony Stark\\Desktop\\Java Novice to Javanista\\Track 2- Java Apprentice\\src\\$1handlingerrors\\introductiontoexception\\$3checkedexception\\";

        FileInputStream myFile = null;

        try {
            myFile = new FileInputStream(filepath + "file.txt");
            DataInputStream readFile = new DataInputStream(myFile);

            while(true) {
                System.out.println(readFile.readUTF());
            }

        } catch (EOFException e) {
            System.out.println("EOFException here-");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException here-");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception here-");
            e.printStackTrace();
        }

        System.out.println("\nThe code execution is complete!");
    }

}
