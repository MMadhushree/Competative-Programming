package college;

import java.util.Scanner;

public class Program11a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the nummer of elements: ");
		int n=scan.nextInt();
		int[] a=new int[5000];
		int storage=0;
		System.out.println("Enter the heights: ");
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int left,right;
		for(int i=0;i<n;i++) {
			left=a[i];
			for(int j=i;j<n;j++){
				left=max(left,a[j]);
			}
			right=a[i];
			for(int j=i;j<n;j++) {
				right=max(right,a[i]);
			}
			storage+=max(left,right)-a[i];
		}
		System.out.println(storage);
		scan.close();
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		if(i>j)
			return i;
		return j;
	}
}
