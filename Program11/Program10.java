package college;

import java.util.*;

public class Program10 {
	public static int[] arr=new int[5000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elelments are present");
		int n = scan.nextInt();
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		MergeSort(0,n-1);
		System.out.println(arr[1]);
		scan.close();
	}

	private static void MergeSort(int i, int j) {
		int mid;
		if(i<j) {
			mid=(i+j)/2;
			MergeSort(i,mid);
			MergeSort(mid+1,j);
			Merge(i,mid,j);
		}
	}

	public static void Merge(int low, int mid, int high) {
		int[] temp=new int[5000];
		int i=low,j=mid+1,k=0;
		while(i<=mid&&j<=high) {
			if(arr[i]<arr[j]) {
				temp[k++]=arr[i++];
			}else {
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=high) {
			temp[k++]=arr[j++];
		}
		for(i=low;i<=high;i++) {
			arr[i]=temp[i];
		}
	}
}
