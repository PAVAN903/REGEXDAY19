package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwordnumeric {

	public static void main(String[] args) {
		System.out.println("enter valid password ");
        Scanner sc=new Scanner(System.in);
		String Npassword=sc.nextLine();
		Pattern pat=Pattern.compile("^[A-Z]{1}[0-9]{1}[a-z]{1,}$");
		Matcher mat=pat.matcher(Npassword);
		boolean b=mat.matches();
		System.out.println(b);
		}
        }
