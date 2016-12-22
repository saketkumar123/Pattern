package com.jlcindia.pattern;

import java.io.IOException;

public class Pattern32 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Last Charecter");
		char ch = (char)System.in.read();
		for(char i=ch;i>= 'A';i--){
			
			for(char j=ch;j>i;j--){
				System.out.print(" ");
			}
			for(char j='A';j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
