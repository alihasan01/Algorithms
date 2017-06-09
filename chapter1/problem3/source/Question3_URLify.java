package chapter1.problem3.source;


import java.util.Scanner;
//1.3 URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
//has sufficient space at the end to hold the additional characters, and that you are given the "true"
//length of the string.

//Input: "I love Pakistan "
//Output: "I%20love%20Pakistan%20"
public class Question3_URLify {
	public static void main(String[] args)
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : "); 
		str = sc.nextLine();
		Question3_URLify obj = new Question3_URLify();
		char[] result = obj.URLify(str);
		System.out.println(result);
	}
	//Time Complexity linear O(n) 
	//Space complexity constant
	public char[] URLify(String str)
	{
		int acc = 0 , counter = 0;
		char a[] = str.toCharArray();
		for (int i= 0 ; i < a.length ; i++)
		{
			if (a[i] == ' ')
				counter++;
		}
		char b[] = new char[str.length() + counter*2]; // New array to handle the spaces
		
		for (int i = 0 ; i < b.length  ; i++)
		{
			if (a[acc] == ' ')
			{
				b[i] = '%';
				b[i+1] = '2';
				b[i+2] = '0';
				i = i+2; 
				acc++;
			}
			else
			{
				b[i] = a[acc];
				acc++;
			}
		}
		System.out.println(b);
		return b;
	}
}
