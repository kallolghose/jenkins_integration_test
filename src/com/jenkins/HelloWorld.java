package com.jenkins;

public class HelloWorld 
{
	public static void main(String [] args)
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		System.out.println("Hello World");
	}
}
