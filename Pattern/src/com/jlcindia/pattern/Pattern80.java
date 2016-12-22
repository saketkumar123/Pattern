package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern80 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
			for(int k=n-1;k>=i;k--){
				System.out.print("  ");
			}
			System.out.print("* ");
			
			for(int j=1;j<(i-1)*2;j++){
				System.out.print("  ");
			}
			if(i>1){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
