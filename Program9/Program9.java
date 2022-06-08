package college;

import java.util.*;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the value of k: ");
		int k=Scan.nextInt();
		System.out.println("Enter the number of elements: ");
		int n=Scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the value of array: ");
		for(int i=0;i<n;i++) {
			arr[i]=Scan.nextInt();
		}
		Arrays.sort(arr);
		k=n-k;
		System.out.println(arr[k]);
		Scan.close();
	}
}
