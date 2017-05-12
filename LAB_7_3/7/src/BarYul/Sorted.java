package BarYul;

public class Sorted {
    private String[] args;
    public static String Sorted(String str){
        String strYul="";
        String[] array=new String[str.length()];
        array[0]=str;
        for(int i=1;i<array.length;i++){
            array[i]=cyclicShift(array[i-1]);
        }
        sort(array);
        for(int i=0;i<str.length();i++){
            strYul+=array[i].charAt(str.length()-1);
        }
        return strYul;
    }
    private static String cyclicShift(String str){
        String[] chars=new String[str.length()];
        for(int i=0;i<str.length();i++){
            chars[i]="";
            chars[i]+=str.charAt(i);
        }
        String ghost=chars[0];
        for(int i=0;i<=chars.length-2;i++){
            chars[i]=chars[i+1];
        }
        chars[chars.length-1]=ghost;
        StringBuilder builder = new StringBuilder();
        for(String s : chars) {
            builder.append(s);
        }
        return builder.toString();
    }

    private static void sort(String[] args){
        for(int j = 0; j < args.length-1; j++){
            for (int i = j + 1; i < args.length; i++) {
                if (args[i].compareToIgnoreCase(args[j]) < 0) {
                    String buff = args[j];
                    args[j] = args[i];
                    args[i] = buff;
                }
            }
        }
    }
}
