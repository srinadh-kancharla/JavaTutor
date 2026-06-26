package main;

public class TwoDarray {

	
	public static void main(String[] args) {
		int ar[][] = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ar[i][j]=(int)(Math.random()*10);
//				System.out.print(ar[i][j]+" ");
			}
//			System.out.println();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		for(int n[]:ar) {
			for(int m:n) {
				System.out.print(m+" ");
			}
			System.out.println();
		
		


	}

	}}
