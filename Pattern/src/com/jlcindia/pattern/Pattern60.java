package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern60 {

	public static void main(String[] args) {
		System.out.println("Enter the Size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n;i>= -n;i--){
			
			for(int j=1;j<=Math.abs(i);j++){
				System.out.print("  ");
			}
			for(int j=Math.abs(i);j<=n;j++){
				System.out.print(j);
			}
			System.out.println();
		}

	}

}