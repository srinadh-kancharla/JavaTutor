package main;
class Phone
{
	public void Call()
	{
		System.out.println("Enter phone number......");
	}
	public String Dail(String no) 
	{
		if (no.length()==10)
		{
			System.out.println(no);
			return "Calling";
		}
		return "Wrong Number";
		
	}
	
}

public class ClassDemo1 
{

	public static void main(String[] args) 
	{
		String no = "949066.16301";
		Phone phn = new Phone();
		phn.Call();
		double num=Double.parseDouble(no);
		System.out.println(num);
		
		System.out.println(phn.Dail(no));
		
		

	}

}
