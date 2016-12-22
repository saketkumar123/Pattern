package com.jlcindia.pattern;

import java.io.IOException;

public class Pattern37 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Height in Charecter A to Z");
		char ch = (char)System.in.read();
		//int n = 5;
		for(char i='A';i<= ch;i++){
			
			for(char j=ch;j>i;j--){
				System.out.print("  ");
			}
			for(char j='A';j<=i;j++){
					System.out.print(i);
			}
			for(char j='A';j<=i-1;j++){
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
