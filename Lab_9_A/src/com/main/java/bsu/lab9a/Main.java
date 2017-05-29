package com.main.java.bsu.lab9a;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("src/Sonet.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF8"));
            File tempFile = new File("SonRec.txt");
            FileWriter fw = new FileWriter(tempFile);

            String str;
            while ((str = in.readLine()) != null) {
                StringBuilder myName = new StringBuilder(str);
                myName.setCharAt(0, Character.toUpperCase(str.charAt(0)));
                fw.write(myName.toString() + "\n");
            }

            fw.close();
            in.close();

        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
