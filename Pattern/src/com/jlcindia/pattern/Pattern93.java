package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern93 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n-1;i++){
			
			for(int j=n-1;j>i;j--){
				System.out.print("  ");
			}
			System.out.print((char)(i+65));
			
			for(int j=1;j<=(i*2);j++){
				System.out.print("  ");
			}
			if(i>=1){
				System.out.print((char)(i+65));
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=0;i--){
			
			for(int j=n-1;j>i;j--){
				System.out.print("  ");
			}
			System.out.print((char)(i+65));
			
			for(int j=1;j<=(i*2);j++){
				System.out.print("  ");
			}
			if(i>=1){
				System.out.print((char)(i+65));
			}
			System.out.println();
		}

	}

}
