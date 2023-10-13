package org.CodeSoft;

import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int rn = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(rn);
		while (count<=10){
			System.out.println("Enter number To Check Luck:-");
			int a = sc.nextInt();
			count++;
			if (rn == a) {
				System.out.println(count + " Times taken to Win  ");
				break;
			}
			if(count>=10) {
				System.err.println("Bater luck next time");
				break;
			}
		}
		
	}
}
