package main;

public class First {

	public static void main(String[] args){
		int a=10;
		try {
			int ans=a/0;
			System.out.println(ans);
		}
		catch(ArithmeticException e) {
		System.out.println(e);
		

		}
		finally{
			System.out.println("Done");
			
		}
	}

}
