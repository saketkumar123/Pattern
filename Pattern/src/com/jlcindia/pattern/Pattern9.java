package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		/*System.out.println("Enter one charecter");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();*/
		for(char i='E';i>= 'A';i--){
			
			for(char j='E';j>='A';j--){
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
