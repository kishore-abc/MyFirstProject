package com.Assignment9;

abstract class Sample
{
	static int x = 50;
	abstract public void test();
	public void count()
	{
		System.out.println("this is count() of Sample");
	}
}
class Demo extends Sample
{
	@Override
	public void test()
	{
		System.out.println("This is test() of Sample Class");
	}
}

public class Mainclass 
{
	public static void main(String[] args)
	{
		System.out.println("The Value of x :"+Sample.x);
		Demo d = new Demo();
		d.test();
		d.count();
	}

}
