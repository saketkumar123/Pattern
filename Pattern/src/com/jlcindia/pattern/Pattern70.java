package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern70 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--){
			
			for(int j=n-1;j>=i;j--){
				System.out.print("  ");
			}
			
			for(int j=i;j>=1;j--){
				System.out.print(i+"  ");
			}
			
			System.out.println();
		}

	}

}
