package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern73 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n;i>=0;i--){
			
			for(int j=n-1;j>=i;j--){
				System.out.print("  ");
			}
			
			for(int j=i;j>=0;j--){
				System.out.print((char)(j+65)+"  ");
			}
			
			System.out.println();
		}

	}

}
