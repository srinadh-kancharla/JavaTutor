package main;
class Man
{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
}
public class Encapsulation {

	public static void main(String[] args) {
		Man m1=new Man();
		m1.setName("Srindh");
		m1.setAge(12);
		System.out.println(m1.getName()+"\t"+m1.getAge());
		
		
	}

}