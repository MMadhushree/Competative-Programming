package second;
import java.util.Scanner;
public class prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n+1];
		int i;
		int A=0,B;
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
			b[a[i]]=b[a[i]]+1;
			if(b[a[i]]>1)
				A=a[i];
		}
		for(B=1;B<n;B++)
		{
			if(b[B]==0)
				break;
		}
		System.out.println(A+" "+B);
		
	}

}
