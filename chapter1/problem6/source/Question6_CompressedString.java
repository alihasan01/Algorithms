package chapter1.problem6.source;

import java.util.Scanner;

//1.6 String Compression: Implement a method to perform basic string compression using the counts
//of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
//"compressed" string would not become smaller than the original string, your method should return
//the original string.

//We can compare present character with next character if the present character is match with next character we move to next iteration.
//If mismatch the we append that character with number of counts. Use string builder instead of string concatenation because string concatenation take extra space.

public class Question6_CompressedString {
	
	public static void main(String [] args)
	{
		String str1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		str1 = sc.nextLine();
		Question6_CompressedString obj = new Question6_CompressedString();
		String answer = obj.compressedString(str1);
		System.out.println(answer);
	}
	
	
	//Time complexity linear O(n)
	//Space complexity linear
	public String compressedString(String str)
	{
		if (str == null)
			return "";
		int count = 0;
		StringBuilder builder = new StringBuilder(); //String builder is used instead of string concatenation because string concatenation take extra time. 
		for (int i = 0 ; i < str.length()  ; i++)
		{
			count++;
			if (i+1 >= str.length() || str.charAt(i) != str.charAt(i + 1 ) )
			{
				builder.append(str.charAt(i));
				builder.append(count);
				count = 0;
			}
		}
		if (builder.length() >= str.length())
			return str;
		return builder.toString();
	}

}
