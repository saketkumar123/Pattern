package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern47 {

	public static void main(String[] args) {
		System.out.println("Enter the max count of star in a row");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = n/2;
		int h = n - sp;
		for(int i=h;i>= 1;i--){
			
			for(int j=sp;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			n -= 2;
			System.out.println();
		}

	}

}
