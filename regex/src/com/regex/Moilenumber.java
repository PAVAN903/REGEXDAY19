package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Moilenumber {

	public static void main(String[] args) {
		System.out.println("enter valid mobile number");
		Scanner sc=new Scanner(System.in);
		String mobile=sc.nextLine();
		Pattern pat=Pattern.compile("^[+]{1}[0-9]{2}\\s[0-9]{10}$");
		Matcher mat=pat.matcher(mobile);
		boolean b=mat.matches();
		System.out.println(b);

	}

}
