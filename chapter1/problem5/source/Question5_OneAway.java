package chapter1.problem5.source;

import java.util.Scanner;

//One Away: There are three types of edits that can be performed on strings: insert a character,
//remove a character, or replace a character. Given two strings, write a function to check if they are
//one edit (or zero edits) away.

//In this problem we can find the solution by categorizing solution in parts:
//1. Replaceable
//2. Editable
//3. Removable
//	Editable and removable can be done with same function by comparing first string that it can be merge to the other or not.
//  Replaceable function is simple it can compare two strings and check that more if only at most one character is different in two string then solution is true otherwise false.
public class Question5_OneAway {
	public static void main(String [] args)
	{
		
		
		//Time Complexity O(n) Linear time
		//Space complexity linear 
		String str1 = "" , str2 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		str1 = sc.nextLine();
		System.out.println("Enter second string : ");
		str2 = sc.nextLine();
		Question5_OneAway obj =  new Question5_OneAway();
		boolean answer = obj.oneEditAway(str1, str2);
		if (answer)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}
	
	public boolean oneEditAway(String s1 , String s2)
	{
		if(s1 == null || s2 == null)
			return false;
		if (s1.length() == s2.length())
			return Replace(s1 , s2);
		else if (s1.length() + 1 == s2.length() )
			return InsertRemove(s1, s2);
		else if (s1.length() - 1 == s2.length())
			return InsertRemove(s2, s1);
		return false;
	}
	public boolean Replace(String s1 , String s2)
	{
		boolean ch = false;
		for (int i = 0  ; i < s1.length() ; i++)
		{
			if (s1.charAt(i) != s2.charAt(i))
			{
				if (ch)
				{
					return false;
				}
				ch = true;
			}
		}
		return true;
	}
	public boolean InsertRemove(String s1 , String s2)
	{
		int count1 = 0 , count2 = 0;
		boolean check = false;
		while(count1 < s2.length() && count2 < s1.length())
		{
			if (s1.charAt(count1) != s2.charAt(count2))
			{
				if (count1 != count2)
				{
					return false;
				}
				count2++;
			}
			else
			{
				count1++;
				count2++;
			}
		}
		return true;
	}

}
