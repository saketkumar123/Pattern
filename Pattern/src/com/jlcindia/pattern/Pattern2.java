package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<= n;i++){
			
			for(int j=1;j<=n;j++){
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
