package javatap;

import java.util.Arrays;
import java.util.Scanner;

public class KthElement {

	public static void smallestElement(int[] a,int k) {
		int n = a.length;
		

		Arrays.sort(a);

		System.out.println(a[n-k]);
		}

	public static void largestElement(int[] a,int k) {
		int n = a.length;
		

		Arrays.sort(a);

		System.out.println(a[k-1]);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		smallestElement(a,k);
		largestElement(a,k);
	}

}
