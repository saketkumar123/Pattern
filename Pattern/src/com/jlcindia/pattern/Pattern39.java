package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern39 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z = 1;
		for(int i=1;i<= n;i++){
			
			for(int j=n;j>i;j--){
				System.out.print("  ");
			}
			for(int j=1;j<=z;j++){
					System.out.print(j);
			}
			z += 2;
			System.out.println();
		}

	}

}
