package com.jlcindia.pattern;

import java.io.IOException;

public class Pattern22 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Last Charecter");
		char ch = (char)System.in.read();
		for(char i=ch;i>= 'A';i--){
			
			for(char j=i;j>='A';j--){
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
