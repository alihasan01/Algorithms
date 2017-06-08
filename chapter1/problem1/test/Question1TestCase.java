package chapter1.problem1.test;
import chapter1.problem1.source.Question1_IsUnique;
public class Question1TestCase {
	public static void main(String[] args)
	{
		Test1();
		Test2();
		Test3();
		Test4();
	}
	public static void Test1()
	{
		Question1_IsUnique obj = new Question1_IsUnique();
		boolean actual = obj.IsUnique("Ali");                           
		boolean expected =  true;
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 1 : Passed");
		else
			System.out.println("Test case 1 : Failed");
	}
	public static void Test2()
	{
		Question1_IsUnique obj = new Question1_IsUnique();
		boolean actual = obj.IsUnique("Hasan");                           
		boolean expected =  false;
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 2 : Passed");
		else
			System.out.println("Test case 2 : Failed");
	}
	public static void Test3()
	{
		Question1_IsUnique obj = new Question1_IsUnique();
		boolean actual = obj.IsUnique("");                           
		boolean expected =  true;
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 3 : Passed");
		else
			System.out.println("Test case 3 : Failed");
	}
	public static void Test4()
	{
		Question1_IsUnique obj = new Question1_IsUnique();
		boolean actual = obj.IsUnique(null);                           
		boolean expected =  true;
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 4 : Passed");
		else
			System.out.println("Test case 4 : Failed");
	}

}
