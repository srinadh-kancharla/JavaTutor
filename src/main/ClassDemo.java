package main;
class Add
{
	public int add(int a,int b) {
//		System.out.println("adding the numbers");
		int r = a + b;
		return r;
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		Add axs=new Add();
		int res = axs.add(a,b);
		System.out.println(res);
		
		

	}

}
