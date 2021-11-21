package com.pb.gubin.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class CapitalLetter {
   public static void enterText(){
       System.out.println("Введите текст:");
   }
   public static void outResult(String snew){
       System.out.println("Результат: " + snew.trim());
   }
    public static void main(String[] args) throws IOException {

        enterText();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();



        String [] words = s.split("\\s+");
        String snew = "";
        for (int i = 0; i < words.length; i++) {
            snew = snew + words[i].substring(0,1).toUpperCase() + words[i].substring(1)+" ";
        }
        outResult(snew);

    }
}
