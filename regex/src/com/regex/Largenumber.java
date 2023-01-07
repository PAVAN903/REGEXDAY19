package com.regex;

public class Largenumber {

	public static void main(String[] args) {
		 int [] number= {10,20,30,40,};
		 int maximum=number[0];
		 int secondmaximum=number[0];
		 for(int  i=1;i<number.length;i++) {
			 if(maximum<number[i]) {
				 maximum=number[i];
			 }
			 }
		 System.out.println("largest value is "+maximum);
		 for(int  i=1;i<number.length;i++) {
			 if(number[i]>secondmaximum&&number[i]<maximum){
				 secondmaximum=number[i];
			 }
			 }
		 System.out.println("largest  second value is "+secondmaximum);
}

	}


