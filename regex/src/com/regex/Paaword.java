package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paaword {

	public static void main(String[] args) {
		System.out.println("enter valid password");
		Scanner sc=new Scanner(System.in);
		String password=sc.nextLine();
		Pattern pat=Pattern.compile("^[a-z]{1,}$");
		Matcher mat=pat.matcher(password);
		boolean b=mat.matches();
		System.out.println(b);
		}
	    }
