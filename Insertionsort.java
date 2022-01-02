package javatap;
import java.util.Scanner;
public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a= new int[n];
		
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for (int i=0;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}
	

}
