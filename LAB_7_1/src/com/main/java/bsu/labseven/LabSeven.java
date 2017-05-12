package com.main.java.bsu.labseven;

import java.util.Scanner;

/**
 * Created by irisha on 09.04.2017.
 */
public class LabSeven {
    public static void main(String[] args) {

        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        String resultString = "";

        char [] chars = originalString.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];

            if(Character.isLetter(current) || current == 32){
                resultString += current;
            }
        }

        chars = resultString.toCharArray();
        resultString="";

        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            resultString += current;

            if (i + 1 != chars.length) {
                char next = chars[i+1];
                if(Character.isLetter(current) && Character.isLetter(next)){
                    resultString += " ";
                }
            }
        }
        System.out.println(resultString);
    }
}
