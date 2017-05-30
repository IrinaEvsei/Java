package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static ArrayList<String> dictionary;
    private static ArrayList<Long> phoneNumbers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input count of words in dictionary");
        int countOfWords = scanner.nextInt();
        scanner.nextLine();

        dictionary = new ArrayList<String>(countOfWords);

        for (int i = 0; i <countOfWords ; i++) {

            System.out.println("Input word: ");
            dictionary.add(scanner.nextLine() );
        }

        System.out.println(dictionary.toString() );
        dictionary.sort((w1,w2)->{
                    if (w2.length()>w1.length())
                        return 1;
                    return -1;
          }
        );

        System.out.println(dictionary.toString() );

        System.out.println("Input count of phone numbers");
        int countOfNumbers = scanner.nextInt();
        scanner.nextLine();

        phoneNumbers = new ArrayList<>(countOfNumbers);

        for (int i = 0; i <countOfNumbers ; i++) {

            System.out.println("Input number: ");
            phoneNumbers.add(scanner.nextLong() );
        }

        System.out.println(findMaxSubstring());


    }

    private static String findMaxSubstring() {



        for (String word : dictionary) {

            if (isWordContainedInNumbers(word))
            {
                return  word;
            }
        }

        return null;
    }

    private static boolean isWordContainedInNumbers(final String word) {

        Long subNumber =  generatePhoneNumberFromString(word);
        System.out.println(subNumber);
        for (Long phoneNumber : phoneNumbers) {
            Pattern pt =Pattern.compile(subNumber.toString());
            Matcher matcher = pt.matcher(phoneNumber.toString());
            if (matcher.find() )
                return true;
         }

         return false;
    }

    private static Long generatePhoneNumberFromString(final String word) {

        StringBuilder str = new StringBuilder(word.length());

        for (int i = 0; i <word.length() ; i++) {
            str.append(getSymbol(word.charAt(i)));
        }


        return Long.parseLong(str.toString());
    }

    private static char getSymbol(char c) {
        if (c >='A' && c<='C')
            return '2';
        if (c >='D' && c<='F')
            return '3';
        if (c >='G' && c<='I')
            return '4';
        if (c >='J' && c<='L')
            return '5';
        if (c >='M' && c<='O')
            return '6';
        if (c >='P' && c<='S')
            return '7';
        if (c >='T' && c<='V')
            return '8';
        if (c >='W' && c<='Z')
            return '9';

        return c;
    }
}
