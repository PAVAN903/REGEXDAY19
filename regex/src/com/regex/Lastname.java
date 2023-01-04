package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lastname {

	public static void main(String[] args) {
		System.out.println("enterlast name");
		Scanner sc=new Scanner(System.in);
		String lName=sc.nextLine();
		Pattern pat=Pattern.compile("^[A-Z]{1}[a-z]{1,}");
		Matcher matcher=pat.matcher(lName);
		boolean b=matcher.matches();
		System.out.println(b);
		

	}

}
