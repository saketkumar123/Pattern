package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern66 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
			for(int k=n-1;k>=i;k--){
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print(j+"  ");
			}
			
			System.out.println();
		}

	}

}
