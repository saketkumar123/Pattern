package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern68 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
			for(int k=n-1;k>=i;k--){
				System.out.print("  ");
			}
			
			for(int j=0;j<i;j++){
				System.out.print((char)(Math.abs(j)+65)+"  ");
			}
			
			System.out.println();
		}

	}

}
