package Runner;

import BarYul.Sorted;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("введите строку - ");
        System.out.println("полученная строка - "+ Sorted.Sorted(in.nextLine()));
    }
}
