package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gmail {

	static void main(String[] args) {
		System.out.println("enter valid gmail id");
		Scanner sc=new Scanner(System.in);
		String gmail=sc.nextLine();
		Pattern pat=Pattern.compile("^abc.[a-zA-Z0-9+_-]+@bl.co.[a-zA-Z0-9-]+gmail$");
		Matcher matcher=pat.matcher(gmail);
		boolean b=matcher.matches();
		System.out.println(b);

}
}