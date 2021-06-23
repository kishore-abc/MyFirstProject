package com.Assignment9;

abstract class AbstractDemo	//Abstract Class
{
	private int i = 10;
	public void display()		//Non-Abstract Method
	{
		System.out.println("Welcome.!");
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}
public  class InheritedClassDemo  extends AbstractDemo
{
	public static void main(String[] args)
	{
		AbstractDemo d = new InheritedClassDemo();
		d.display();
		System.out.println(d.getI());	
	}

}
