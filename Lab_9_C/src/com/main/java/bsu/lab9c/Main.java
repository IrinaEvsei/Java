package com.main.java.bsu.lab9c;

/*
Из файла удалить все слова, содержащие от трех до пяти символов,
но при этом их каждой строки должно быть удалено
только максимальное четное количество таких слов
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by irisha on 28.05.2017.
 */
public class Main {
        public static void main(String[] args) {

            File dir= new File("src\\");//File.separator
            File file1 = new File(dir,"file.txt");
            try {
                createFile(file1);
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
                System.exit(1);
            }

            String example = "Hello, world!\n Nice to meet you at the university!\n My name is I r i n a Evsei";
            readfromFile(file1);
            writeinFile(file1,example ,false);
            readfromFile(file1);
            System.out.println("\n");
            delSubstr(example);

        }

        static void createFile(File file) throws IOException{//throws пишется для обработки исключения в методе, но не указывается при исключениях типа RuntimeException
            //throw new Throwable("Error") пишется для отлова программистских ошибок в коде и используется для отлова ошибок Error и RuntimeException
            if(file.exists())
                System.out.println("File exists.");
            else
            {
                System.out.println("File doesn't exist.");
                boolean created = file.createNewFile();
                if(created)
                    System.out.println("File has been created.");
            }
        }

        static void writeinFile(File file,String text, boolean append){
            FileOutputStream fout = null;
            try{
                if(append)
                    fout = new FileOutputStream(file, append);
                else fout = new FileOutputStream(file,append);
                for(int i = 0; i < text.length(); i++){
                    fout.write(text.charAt(i));
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
            finally {
                try {
                    if(fout != null) fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        static void readfromFile(File file){
            int i;
            FileInputStream fin = null;
            try {
                fin = new FileInputStream(file);
                System.out.println("\n");
                do{
                    i = fin.read();
                    if(i != -1) System.out.print((char) i);
                }
                while (i != -1);
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
            finally {
                try {
                    if(fin != null) fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void clearFile(File file){
            writeinFile(file,"",false);
        }

        public static void delSubstr(String testString){
            File dir = new File("src\\");
            File file = new File(dir,"fileBuf.txt");
            try {
                createFile(file);
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
                System.exit(1);
            }
            Pattern forword = Pattern.compile("\\w{3,5}");
            Pattern backsp = Pattern.compile(" ");
            clearFile(file);
            Pattern f = Pattern.compile("\\n");
            String[] sents = f.split(testString);
            for (String sent:sents) {
                String[] wordS = backsp.split(sent);
                int count = wordS.length, wrwrdcount = 0;
                for (String word:wordS) {
                    Matcher wrd = forword.matcher(word);
                    if (wrd.matches()){wrwrdcount++;}
                }
                if (wrwrdcount%2==1) {
                    for(int i = 0; i<wordS.length;i++){
                        Matcher wrd = forword.matcher(wordS[i]);
                        if (wrd.matches()){
                            wrwrdcount--;
                            if (wrwrdcount==0) {writeinFile(file, wordS[i] + " ", true);}
                        }
                        else writeinFile(file, wordS[i] + " ", true);
                    }
                }
                else{
                    for (String word : wordS) {
                        Matcher wrd = forword.matcher(word);
                        if (!wrd.matches()) {
                            writeinFile(file, word + " ", true);
                        }
                    }
                }
                writeinFile(file, "\n", true);
            }
            readfromFile(file);
        }
    }