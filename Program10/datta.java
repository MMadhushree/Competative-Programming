package second;

import java.util.Scanner;

public class tenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int ans=0;
		if(n<3)
		{
			System.out.println(ans);
		}
		else {
			int L=0,Container=1,R=2;
			while(R<n){
				
				if(a[Container]<a[L]) {
					while(a[R]<a[L])
					{
						R++;
						if(R>=n) {
							break;
						}
					}
					
					while(Container<R)
					{
						
						ans=ans+a[L]-a[Container];
						Container++;
						if(R>=n) {
							break;
						}
					}
					L=R;
					Container++;
					R=R+2;
					if(R>=n) {
						break;
					}
				}
				else {
					Container++;
					L++;
					R++;
				}
			}
		System.out.println(ans);
		}
	}
}
