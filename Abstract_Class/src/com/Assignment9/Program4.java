package com.Assignment9;
abstract class Cat
{
	public abstract void catSound();	//Abstract-Method
	public static void display()		//Concrete-Methods  
	{
		System.out.println("this is display() of Abstract Class");
	}

}
public class Program4 extends Cat
{
	public void catSound()
	{
		System.out.println("Meow Meow..!");
	}

	public static void main(String[] args) 
	{
		Cat c = new Program4();
		c.catSound();		 //Calling Abstract Method
		Cat.display();       //Calling Non-Abstract Method
	}

}
