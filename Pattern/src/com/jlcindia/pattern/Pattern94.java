package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern94 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=1;
		
		for(int i=n;i>= 1;i--){
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int j=s;j>1;j--){
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--){
				System.out.print("*");
			}
			System.out.println();
			s++;
		}

	}

}
