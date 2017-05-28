package com.main.java.bsu.lab10a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * Created by irisha on 28.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> str1 = new Stack<Integer>();
        Stack<Integer> str2 = new Stack<Integer>();


        str1.push(10);
        str1.push(20);

        str2.push(30);
        str2.push(40);


        System.out.println("First stack before " + str1);
        System.out.println("Second stack before " + str2);

        Iterator<Integer> i1 = str1.iterator();
        Iterator<Integer> i2 = str2.iterator();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        while(i1.hasNext()) {
            list1.add(i1.next());
        }

        while(i2.hasNext()) {
            list2.add(i2.next());
        }

        str1.clear();

        for(int j =0;j<list2.size();j++) {
            str1.push(list2.get(j));
        }

        str2.clear();

        for(int j =0;j<list1.size();j++) {
            str2.push(list1.get(j));
        }
        System.out.println("First stack after " + str1);
        System.out.println("Second stack after " + str2);
    }
}
