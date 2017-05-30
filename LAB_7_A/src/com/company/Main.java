package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println( deleteSymbols(input) );
    }

    private static String deleteSymbols(String input) {

        return input.replaceAll( "[^a-zA-Z\\s]" ,"" );
    }
}
