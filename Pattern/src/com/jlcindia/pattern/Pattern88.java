package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern88 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<i;j++){
				System.out.print("  ");
			}
			System.out.print((char)(i+65));
			for(int j=k;j<(n-1)*2;j++){
				System.out.print("  ");
			}
			if(i<n-1){
				System.out.print((char)(i+65));
			}
			k += 2;
			System.out.println();
		}

	}

}
