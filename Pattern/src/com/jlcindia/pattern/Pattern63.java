package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern63 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n;i>= n;i--){
			
			for(int j=1;j>=i;j++){
				System.out.print(" ");
			}
			
			for(int k=3;k>=i;k--){
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
