package chapter1.problem4.source;

import java.util.Scanner;
//Palindrome Permutation: Given a string, write a function to check if it is a permutation of
//a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
//permutation is a rearrangement of letters. The palindrome does not need to be limited to just
//dictionary words.

//For the solution of problem we have to count number of characters in string which are odd.
//Example abbcc. In this string we have a = 1 , b = 2 and c = 2. Means only 1 character comes in odd number of times which is "a".
//If in a given string we have only 1 or less than 1 odd count then we have palindrome which is permutation other wise not.
public class Question4_PalindromePermutation {

	public static void main(String [] args)
	{
		String str = "";
		System.out.println("Enter string : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		Question4_PalindromePermutation obj = new Question4_PalindromePermutation();
		Boolean answer = obj.PermutationPelindrome(str);
		if (answer)
			System.out.println("Entered string is Palindrome.");
		else
			System.out.println("Entered string is not palindrome.");
	}
	public boolean PermutationPelindrome(String str)
	{
		int size = Character.getNumericValue('z') - Character.getNumericValue('a') + 1; //Specifying the length of hash table
		//System.out.println(size);
		//System.out.println(Character.getNumericValue('z'));
		int []table = new int[size];
		int count = 0;
		for (char ch : str.toCharArray())
		{
			int x = getCharNumber(ch); //Getting number of character to place it in hash table. e.g 'a' or 'A' has 10
			if (x != -1)
			{
				table[x]++;
				if (table[x] % 2 == 1) 
				{
					count++;
				}
				else
				{
					count--;
				}
			}
		}
		if (count <= 1)  //If we found more than 1 character at odd number of times we return false.
			return true;
		else
			return false;
	}
	public int getCharNumber(char ch) //This function is used to find the number of character
	{
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int c = Character.getNumericValue(ch);
		//System.out.println(a +" " + z+ " " + c + " ");
		if ( a <= c && c <= z)
			return c - a;
		return -1;
	}
}
