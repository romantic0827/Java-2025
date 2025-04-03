package week05;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 몇 단을 계산할까?");
		int scanData = sc.nextInt();
		
		System.out.println("구구단 " + scanData + "단 출력");
		
		for (int i = 1; i < 10; i++)
			System.out.printf("%d x %d = %d\n", scanData, i, scanData*i);

		sc.close();
	}

}
