package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern75 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
			for(int j=n-1;j>=i;j--){
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print(i+"  ");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--){
			
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
