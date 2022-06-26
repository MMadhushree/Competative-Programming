package college;

import java.util.*;

public class Program10 {
	public static int min=999;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elelments are present");
		int n = scan.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int min=BinarySearchi(a,0,n-1);
		System.out.println(min);
		scan.close();
	}
	private static int BinarySearchi(int[] a,int i, int j) {
		// TODO Auto-generated method stub
		int mid,key=a[i];
		if(min>a[i]) {
			min=a[i];
			//System.out.println(min);
		}
		if(i!=j&&a[i]>a[i+1]) {
			return a[i+1];
		}
		if(i<j) {
			mid=(i+j)/2;
			if(key<a[mid])
				BinarySearchi(a,mid+1,j);
			else
				BinarySearchi(a, i, mid);
		}
		else {
			return min;
		}
		return min;
	}
}
