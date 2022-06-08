package college;

import java.util.*;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=scan.nextInt();
		int[] arr = new int [n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		int pre_ele=0,rep_ele=0;
		for(int ele:arr) {
			if(pre_ele==ele) {
				System.out.print("["+ele+",");
				rep_ele=ele;
				break;
			}
			pre_ele=ele;
		}
		for(int ele:arr) {
			if(ele==arr[0]) {
				pre_ele=ele;
				continue;
			}
			else if(rep_ele!=ele) {
				if(pre_ele+1!=ele) {
					System.out.println(pre_ele+1+"]");
					break;
				}
			}
			pre_ele=ele;
		}
		scan.close();
	}
}
