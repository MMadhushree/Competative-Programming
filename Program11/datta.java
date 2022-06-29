package second;
import java.util.Scanner;
public class eleventh {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int  n=sc.nextInt();
		int[] a = new int[n+1];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int low=0,high=n-1,mid=(low+high)/2;
		if(a[high]>a[low])
			System.out.println(a[0]);
		else {
		while(low<high) {
			mid=(low+high)/2;
			if((a[mid-1]>a[mid] && a[mid+1]>a[mid]) || mid==0) {
				break;
			}
			if(a[mid]>a[high]){
				low=mid;				
			}
			if(a[mid]<a[high]) {
				high=mid;
			}
		}
		System.out.println(a[mid]);
		}
	}
}
