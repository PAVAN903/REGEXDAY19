package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUppercase {

	public static void main(String[] args) {
		System.out.println("enter valid password");
		Scanner sc=new Scanner(System.in);
		String Upassword=sc.nextLine();
		Pattern pat=Pattern.compile("^[A-Z]{1}[a-z]{1,}$");
		Matcher mat=pat.matcher(Upassword);
		boolean b=mat.matches();
		System.out.println(b);

	}

}
