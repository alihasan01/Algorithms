package chapter1.problem9.source;

import java.util.Scanner;

public class Question9_StringRotation {
//1.9 String Rotation: Assume you have a method i5Substring which checks ifone word is a substring
//	of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
//	call to isSubstring
	
//In this problem we concatenate first string by itself and check that either it contains other string or not.
//If contains then it means it rotate otherwise not.
	
//Time complexity linear O(n)	
	public static void main(String[] args)
	{
		String s1 = "" , s2= "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter second string  : ");
		s1 = sc.nextLine();
		
		System.out.println("Enter first string  : ");
		s2 = sc.nextLine();
		
		Question9_StringRotation obj = new Question9_StringRotation();
		System.out.println(obj.stringRotation(s1, s2));
	}
	public boolean stringRotation(String s1 , String s2)
	{
		if (s1.length() != s2.length() && (s1.length() > 0))
			return false;
		String s3 = s1 + s1;
		if(s3.contains(s2))
			return true;
		return false;
	}
}
