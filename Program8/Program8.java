package college;

import java.util.*;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		int diff1=arr[1]-arr[0];
		int diff2=arr[2]-arr[1];
		int diff3 = 0;
		if(n>3) {
			diff3=arr[3]-arr[2];
		}
		int i=arr[0];
		if(diff1==diff2) {
			for(int ele:arr) {
				if(i==ele) {
					i+=diff1;
				}else {
					System.out.println("["+ele+","+i+"]");
					break;
				}
			}
		}else if(diff2==diff3) {
			for(int ele:arr) {
				if(i==ele) {
					i+=diff2;
				}else {
					System.out.println("["+ele+","+i+"]");
					break;
				}
			}
		}else {
			for(int ele:arr) {
				if(i==ele) {
					i+=diff3;
				}else {
					System.out.println("["+ele+","+i+"]");
					break;
				}
			}
		}	
		scan.close();
	}
}
