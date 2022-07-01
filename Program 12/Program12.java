package college;

import java.util.*;

public class Program12 {
	static final double THRESHOLD = 0.0001;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements to entered: ");
		int n=s.nextInt();
		String[] a = new String[n];
		Float[] b = new Float[n];
		TreeSet<String> ts = new TreeSet<String>();
		System.out.println("Enter the name and marks: ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.next();
			b[i]=s.nextFloat();
		}
		Float[] c =new Float[n];
		c=b;
		Arrays.sort(c);
		Float g=new Float(123);
		for(int i=0;i<c.length;i++)
			if(c[i]!=c[i+1]) {
				g=c[i+1];
				break;
			}
		for(String i:a) {
			System.out.print(i+" ");
		}
		for(int i=0;i<n;i++) {
			if(g.equals(b[i])) {
				ts.add(a[i]);
			}
		}
		System.out.println("The 2nd least recived marks is: ");
		for(String i:ts)
			System.out.println(i+" ");
		s.close();
	}

}
