package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern84 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		for(int i=n-1;i>=0;i--){
			
			for(int j=n-1;j>k;j--){
				System.out.print("  ");
			}
			System.out.print((char)(i+65));
			
			for(int j=1;j<(k*2);j++){
				System.out.print("  ");
			}
			if(i<n-1){
				System.out.print((char)(i+65));
			}
			System.out.println();
			k++;
		}

	}

}
