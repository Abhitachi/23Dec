package javatap;
import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int k=sc.nextInt();
		
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length-1;i++) {
			int min_i=i;						//i=0; : i=1; : i=2;
			for(int j=i+1;j<a.length;j++) {		//1<5;2<5;3<5;4<5; : j=2<5;3<5;4<5; : 3<5;
				if(a[j]<a[min_i]) {				//a[1](165)<a[0](122) false; 10<122 true;100<10 false;17<10 false; 10 122 165 100 17 :165<122 false;100<122 true;17<122t;
					min_i=j;					//min_i=2; : min_i=1; min_i=3;min_i=4;
				}
			}
			int temp=a[i];						//temp=a[1]=122;
			a[i]=a[min_i];						//a[1]=a[4]=17;
			a[min_i]=temp;						//a[4]=122;
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(a[0+k-1]);			//kth smallest 
		System.out.println(a[a.length-k]);		//kth biggest
		
	}

}
