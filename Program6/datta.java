import java.util.Scanner;

public class project3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		int a=n;
		int k,i;
		for(i=0,k=n;i<n & k!=-1;i++,--k){
			a=k;
			while(a!=0) {
				System.out.print(" ");
				a--;
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=n,k=0;i>0 &k!=n;i--,k++) {
			a=k;
			while(a!=0){
				System.out.print(" ");
				a--;
			}
			for(int j=i-1;j>=0;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		scan.close();
	}
}
