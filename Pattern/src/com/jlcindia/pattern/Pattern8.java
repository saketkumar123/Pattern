package com.jlcindia.pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		/*System.out.println("Enter one charecter");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();*/
		for(char i='E';i>= 'A';i--){
			
			for(char j='A';j<='E';j++){
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
