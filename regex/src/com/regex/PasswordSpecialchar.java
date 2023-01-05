package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordSpecialchar {

	public static void main(String[] args) {
	System.out.println("enter valid password");
	Scanner sc=new Scanner(System.in);
	String Spassword=sc.nextLine();
	Pattern pat=Pattern.compile("^[A-Z]{1}[a-z]{5}[@]{1}[a-z]{8,}[0-9]{1}$");
	Matcher mat=pat.matcher(Spassword);
	boolean b=mat.matches();
	System.out.println(b);
	

	}

}
