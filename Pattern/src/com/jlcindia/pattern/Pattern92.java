package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern92 {

	public static void main(String[] args) {
		System.out.println("Enter the Height of the pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for(int i=n;i>1;i--){
			
			for(int j=n-1;j>=k;j--){
				System.out.print("  ");
			}
			System.out.print(i);
			
			for(int j=1;j<(k-1)*2;j++){
				System.out.print("  ");
			}
			if(i<n){
				System.out.print(i);
			}
			System.out.println();
			k++;
		}
		k=1;
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<i;j++){
				System.out.print("  ");
			}
			System.out.print(i);
			for(int j=k;j<(n-1)*2;j++){
				System.out.print("  ");
			}
			if(i<n){
				System.out.print(i);
			}
			k += 2;
			System.out.println();
		}

	}

}
