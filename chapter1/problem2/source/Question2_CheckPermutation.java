package chapter1.problem2.source;


import java.util.Scanner;
//1.2) Check Permutation: Given two strings, write a method to decide if one is a permutation of the
//other.
//In this problem we have to check that either two strings have the same all same characters or not.
//For example ali and ila, one string is permutation to other because two strings have equal length and same characters.
//We are assuming that Ali and ali are not permutation of each other because A and a are not same characters. 
public class Question2_CheckPermutation {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String [] args)
	{
		String str1 , str2 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string "); 
		str1 = sc.nextLine();
		System.out.println("Enter Second string "); 
		str2 = sc.nextLine();
		boolean check = permutation(str1 , str2);
		if (check == true )
		{
			System.out.println("One Strings is permutation to other. ");
		}
		else
		{
			System.out.println("One Strings is not permutation to other. ");
		}
	}
	//Time complexity Linear O(n)
	//Space complexity constant
	
	public static boolean permutation(String str1 , String str2)
	{
		if (str1.length() != str2.length())
			return false;
		int []letters = new int[128];
		char []charArray = str1.toCharArray();
		for (char ch : charArray)
		{
			letters[ch]++;
		}	
		for(int i = 0 ;  i < str2.length() ; i++ )
		{
			char ch = str2.charAt(i);
			letters[ch]--;
			if (letters[ch] < 0)
				return false;
		}
		return true;
		
	}
	//Time complexity is quadratic O(n^2)
	public static boolean MySolution(String str1 , String str2)
	{
		if (str1.length() !=  str2.length())
			return false;
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();		
		for (int i = 0 ; i < str1.length() ; i++) //These two loops are for sorting purpose
		{										  //We can use Java library function "sort" to to sort the array. 	
			char ch = a[i];
			int index = i;
			for (int j = i+1 ; j < str1.length() ; j++ )
			{
				if (ch < a[j])
				{
					ch = a[j];
					index = j;
				}
			}
			char tmp = a[i];
			a[i] = ch;
			a[index] = tmp;
			
		}
		for (int i = 0 ; i < str2.length() ; i++)
		{
			char ch = b[i];
			int index = i;
			for (int j = i+1 ; j < str2.length() ; j++ )
			{
				if (ch < b[j])
				{
					ch = b[j];
					index = j;
				}
			}
			char tmp = b[i];
			b[i] = ch;
			b[index] = tmp;
			
		}
		boolean checking = true;
		for (int i = 0 ; i < a.length ; i++)
		{
			if (a[i] != b[i])
			{
				checking = false;
				break;
			}
		}
		if (checking)
			return true;
		else
			return false;
	}
}
