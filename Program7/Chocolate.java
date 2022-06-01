package college;

import java.util.Arrays;
import java.util.Scanner;

public class Chocolate {
	public static int[] subArray(int[] arr, int beg, int end) {
        return Arrays.copyOfRange(arr, beg, end + 1);
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		for(int nu:arr) {
			System.out.println(nu);
		}
		System.out.println("Enter the number of students present: ");
		int m=scan.nextInt();
		int min=arr[m-1]-arr[0];
		for(int i=0;i<n;i++) {
			if(i+m<=n) {
			int[] subarray = subArray(arr,i,i+m);
				if(subarray[m-1]-subarray[0]>0) {
					if(min>subarray[m-1]-subarray[0]) {
						min=subarray[m-1]-subarray[0];
					}
				}
			}
		}
		System.out.println("Minimum Difference is "+min);
		scan.close();
	}

}
