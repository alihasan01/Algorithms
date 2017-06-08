
import java.util.Scanner;

public class Question1_IsUnique {
	
	//  1.1)  Is Unique: Implement an algorithm to determine if a string has all unique characters?
	//  In this problem we have to identify in a string either repetitive characters are present in a string or not.
	//  If such repetitive characters are present we return false else if we have all unique characters in string then we return true. 
	//  "Ali" have all unique characters so return true. "Hasan" don't have all unique characters so return false. 
	@SuppressWarnings({ "resource" })
	public static void main(String[] args)
	{
		String str = "";    
		System.out.println("Enter String ");                    //Taking string Input from user
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		boolean bool = IsUnique(str);                           
		if (bool)
			System.out.println("String has all unique characters.");
		else
			System.out.println("String doesn't have all unique charcters");
		
	}
	//Time complexity linear O(n) : we have one loop with n iteration (n = length of string)
	//Space complexity constant O(1)
	public static boolean IsUnique(String str)                //This solution is better and actual solution because having linear time complexity and constant space complexity.
	{
		if (str.length() > 128 )  //If string has more than 128 characters then it must have repetition because in ASCII we have not more than 128 characters.
			return false;
		boolean charArray[] = new boolean[128]; 
		for (int i = 0 ; i < str.length() ; i++)
		{
			int val = str.charAt(i);
			if(charArray[val])        //Condition to check if character already present then return false.
			{
				return false;
			}
			charArray[val] = true;
		}
		return true;
	}
	public void mySolution()                             //This solution is good when other data structures are not allowed to use.       
	{												     //In this solution I pick each character of string and match it to all other if it matches return false.
		
		//Time Complexity quadratic O(n^2)
		//Space complexity constant O(1)
		String str = "";    
		System.out.println("Enter String "); 
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		boolean check = true;
		for (int i = 0 ; i < str.length() && check  ; i++)
		{
			char ch = str.charAt(i);
			for (int j = 0 ; j < str.length() ; j++)
			{
				if (ch == str.charAt(j) && i !=  j)
				{
					System.out.println("String " + str + " doesn't have all unique characters.");
					check = false;
					break;
				}
			}
			
		}
		if (check)
			System.out.println("String " + str + " has all unique characters. ");
			
	}

}

