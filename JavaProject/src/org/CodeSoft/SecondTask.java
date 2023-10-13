package org.CodeSoft;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class SecondTask {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To Word Count");
		System.out.println("1. Enter Text Manually");
		System.out.println("2. Read Text From File");
		int n = sc.nextInt();
		int count = 0;
		sc.nextLine();
		String st = "";
		if (n == 1) {
			System.out.println("Enter Your Text:-");
			st = sc.nextLine();
		} else if (n == 2) {
			System.out.println("Enter The File Path:-");
			String str = sc.nextLine();
			try {
				FileReader fr = new FileReader(str);
				sc = new Scanner(fr);
				while (sc.hasNextLine()) {
					// System.out.println(sc.nextLine());
					st = sc.nextLine();
					
				}
				fr.close();
			} catch (IOException e) {
				System.err.println("File Not found. Please check The File Path ");
				System.exit(1);
			}
		} else {
			System.err.println("Invalid Choice.");
			System.exit(1);
		}

		String[] sa = st.split(" ");
		for (int i = 0; i < sa.length; i++) {
			count++;
		}
		System.out.println(count);

	}

}
