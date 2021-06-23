package com.Assignment9;

abstract class Animal
{
	public abstract void dogSound();
}
public class Program3 extends Animal 
{
	public void dogSound()
	{
		System.out.println("Bow Bow.!");
	}
	public static void main(String[] args)
	{
		Animal obj = new Program3();
		obj.dogSound();
	}

}
