package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern56 {

	public static void main(String[] args) {
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n;i>= -n;i--){
			
			for(int j=n;j>=Math.abs(i);j--){
				System.out.print((char)(j+65));
			}
			System.out.println();
		}

	}

}
