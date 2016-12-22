package com.jlcindia.pattern;

import java.io.IOException;

public class Pattern41 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Height in Charecter A to Z");
		char ch = (char)System.in.read();
		char z = 'A';
		for(char i='A';i<= ch;i++){
			
			for(char j=ch;j>i;j--){
				System.out.print("  ");
			}
			for(char j='A';j<=z;j++){
					System.out.print(j);
			}
			z += 2;
			System.out.println();
		}

	}

}
