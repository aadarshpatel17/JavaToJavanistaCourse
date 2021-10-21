package $2handlingException.$5workingwiththrowskeyword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

    public static void main(String[] args) throws IOException {

        String filepath = "C:\\Users\\Tony Stark\\Desktop\\Java Novice to Javanista\\Track 2- Java Apprentice\\src\\$2handlingexceptioninjava\\$4usingfinallyblock\\file.txt";
        String wrongFilepath = "file.txt";

        File file = new File(wrongFilepath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = br.readLine();
        while(st != null) {
            System.out.println(st);
            st = br.readLine();
        }

    }
}
