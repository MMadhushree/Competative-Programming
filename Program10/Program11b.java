package college;

import java.util.*;

public class Program11b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements: ");
		n=scan.nextInt();
		int[] a=new int[n];
		int[] s=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int product=1;
		for(int i=0;i<n;i++) {
			product*=a[i];
			s[i]=product;
		}
		product=1;
	    for(int i=n-1; i>0; i--){
	            s[i]=s[i-1]*product;
	            product*=a[i];
	     }
	    s[0]=product;
	    for(int i:s) {
	    	System.out.print(i+" ");
	    }
		scan.close();
	}
}
