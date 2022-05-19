package college;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to be inserted: ");
		int n=sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the s value: ");
		int count=0,s=sc.nextInt();
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(count<s) {
					count+=a[j];
				}
				if(count==s) {
					System.out.println((i+1)+" "+(j+1));
					break;
				}
			}
			if(count==s) {
				break;
			}
			count=0;
		}
		sc.close();
	}

}
