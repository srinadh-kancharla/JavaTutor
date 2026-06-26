package main;
class Addu
{
	public int addition(int a, int b) 
	{
		return a+b;
		
	}
	public int addition(int a, int b,int c) 
	{
		return a+b+c;
	}
}

public class MethodOverloading 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		Addu sum = new Addu();
		int val1=sum.addition(a,b);
		int val2=sum.addition(a,b,c);
		System.out.println(val1+" "+val2);
	}

}
