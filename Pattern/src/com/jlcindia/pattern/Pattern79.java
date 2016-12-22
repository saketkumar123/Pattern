package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern79 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
			for(int j=n-1;j>=i;j--){
				System.out.print("  ");
			}
			
			for(int j=0;j<i;j++){
				System.out.print((char)(j+65)+"  ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++){
			
			for(int j=n-i;j<n+1;j++){
				System.out.print("  ");
			}
			
			for(int j=i+1;j<n;j++){
				System.out.print((char)(j+65)+"  ");
			}
			System.out.println();
	}
	}
}
