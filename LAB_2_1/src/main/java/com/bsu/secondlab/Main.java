package main.java.com.bsu.secondlab;


import java.util.Scanner;

/**
 * @author Irina Evsei
 */

public class Main {

    public static boolean checkNumber(int number) {
        int array[] = new int[10];
        for(int i = 0; i < 10; ++i) {
            array[i] = 0;
        }

        while(number > 0) {
            int temp = number % 10;
            array[temp]++;
            if(array[temp] > 1) {
                return false;
            }
            number /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 0;
        int temp;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int numberArray[] = new int[n];

        for(int i = 0; i < n; ++i) {
            numberArray[i] = scanner.nextInt();
        }

        System.out.println("первое число с различными числами: ");
        for(int i = 0; i < n; ++i) {
            if(checkNumber(numberArray[i])) {

                System.out.println(numberArray[i]);
                break;
            }
        }
    }
}
