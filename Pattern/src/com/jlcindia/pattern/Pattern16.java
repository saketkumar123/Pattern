package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<= n;i++){
			
			for(int j=n;j>=i;j--){
				System.out.print(i);
			}
			System.out.println();
		}

	}

}