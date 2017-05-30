package bsu.by;
import java.util.*;
public class Main {


        public static void main(String... args) {

            int size = 0;
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> arr = new ArrayList<>();

            System.out.print("Введите количество чисел: ");
            size = sc.nextInt();

            for (int i = 0; i < size; i++) {

                arr.add(sc.nextInt());
            }

            arr.sort(((o1, o2) -> o1 - o2));
            System.out.println(arr);

        }
    }

