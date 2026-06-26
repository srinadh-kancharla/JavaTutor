package main;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] brr=new int[3][];
		brr[0]=new int[4];
		brr[1]=new int[10];
		brr[2]=new int[1];
		
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				brr[i][j]=(int)(Math.random()*100);
			}
		}
		for(int n[]:brr) {
			for(int m:n) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		

	}

}
