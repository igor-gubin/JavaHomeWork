package com.pb.gubin.hw9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileNumbers {
    public static void createNumbersFile() {


        File out = new File("numbers.txt");
        FileWriter fw = null;
        int n = 512;

        try {

            fw = new FileWriter(out);

            BufferedWriter writer = new BufferedWriter(fw);
            int line;
            Random random = new Random();
            while (n > 0) {

                line = random.nextInt(1000);
                writer.write(line + "\n");
                n--;
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
    public static void main (String[] args) {
        createNumbersFile();
    }
}