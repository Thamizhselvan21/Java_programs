package program;

import java.util.Scanner;

public class voter
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name and age:");
		String name =s.nextLine();
		int age=s.nextInt();
		if(age>=18)
		{
			System.out.println(name+" is eligible");
		}
		else
		{
			System.out.println(name+" is not eligible");
		}
	}
}
