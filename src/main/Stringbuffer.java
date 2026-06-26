package main;

public class Stringbuffer {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		StringBuffer sd=new StringBuffer("Srinadh");
		System.out.println(sd.capacity());
		System.out.println(sd);
		System.out.println(sd.insert(0, "Kancharla "));
		System.out.println(sd.hashCode());
		
		
	}

}
