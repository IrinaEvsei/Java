package main.java.com.bsu.firstlab;
//������ � ������� n ����� ����� � ��������� �� � ������. �� ������� �������:
// ������ � �������� �����.
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FirstLab {
	public static void main(String[] args) { 

		System.out.print("������� ���������� �����: "); 
		Scanner scanner = new Scanner(System.in); 

		int n = scanner.nextInt(); 

		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
			for (int i =0; i<n;i++)
			{ 
					System.out.print(" ������� [" + i + "] �������: "); 
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
		
		System.out.println("�������� ����� " + odd.toString());
		System.out.println("������ ����� " + even.toString());
	}
}
