package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n;i>= 1;i--){
			
			for(int j=i;j>=1;j--){
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
