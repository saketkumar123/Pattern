package com.jlcindia.pattern;

import java.io.IOException;
import java.util.Scanner;

public class Pattern46 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Height");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<= n;i++){
			
			for(int j=n;j>=i;j--){
				System.out.print("  ");
			}
			for(int j=i ; j>=-i ; j--){
					System.out.print((char)(i-Math.abs(j)+65));
			}
			System.out.println();
		}

	}

}
