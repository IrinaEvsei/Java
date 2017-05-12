package main.java.com.bsu.firstlab;
//Ввести с консоли n целых чисел и поместить их в массив. На консоль вывести:
// Четные и нечетные числа.
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FirstLab {
	public static void main(String[] args) { 

		System.out.print("Введите количество чисел: "); 
		Scanner scanner = new Scanner(System.in); 

		int n = scanner.nextInt(); 

		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
			for (int i =0; i<n;i++)
			{ 
					System.out.print(" Введите [" + i + "] элемент: "); 
					int temp = scanner.nextInt(); 
					if (temp % 2 != 0) 
					{ 
						odd.add(temp); 
					}
					if (temp % 2 == 0) 
					{ 
						even.add(temp); 
					}
			} 
		scanner.close(); 
		
		System.out.println("Нечетные числа " + odd.toString());
		System.out.println("Четные числа " + even.toString());
	}
}
