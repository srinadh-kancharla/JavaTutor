package main;
class Student{
	int id;
	String Name;
	float marks;
	
}
public class ArraysWithObjCreation 
{

	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.id=1;
		s1.Name="Srinadh";
		s1.marks=98.21f;
		
		s2.id=2;
		s2.Name="Sri";
		s2.marks=98.14f;
		
		s3.id=3;
		s3.Name="nadh";
		s3.marks=92.21f;
		
		Student students[]= new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		for(int i=0;i<3;i++) {
		System.out.println("ID: "+students[i].id+" "+students[i].Name+"--> Marks: "+students[i].marks);
		}
		System.out.println("Enhance Loop");
		for( Student std:students) {
			System.out.println("ID: "+std.id+" "+std.Name+"--> Marks: "+std.marks);
		}
		
		

	}

}
