package Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int i = 1;
		//int p=1;
		while(i<=n) {
			char p= (char) ((char)'A'+i-1);
			int j=1;
			while(j<=n) {
				//System.out.print("*");
				
				System.out.print(p);
			    p=(char)(p+1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
