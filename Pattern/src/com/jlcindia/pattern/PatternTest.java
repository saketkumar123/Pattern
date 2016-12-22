package com.jlcindia.pattern;

import java.util.Scanner;

public class PatternTest {
	public static void main (String args[]){
		System.out.println("Enter the Height of the Triangle");
		Scanner sc = new Scanner(System.in);
		
		int ln = sc.nextInt(); //change number of lines
		//int ln = 5;
		int out = 1;
		for(int i=1;i<=ln;i++){ 
			String outline = "";
			if(i%2==0){ 
				int out1 = out + i - 1;  
				for(int j=0;j<i;j++){
					outline = outline + out1; 
					out1--;
					if(j!=i-1){ 
						outline = outline + "*"; 
					} else{
						out = out+j+1; 
					}
				}
			} else{
				for(int j=0;j<i;j++){ 
					outline = outline + out; 
					out++;
					if(j!=i-1){
						outline = outline + "*";
					}
				}
			}
			System.out.println(outline); 
		}
	}
}
