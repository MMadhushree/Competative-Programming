package college;

import java.util.Scanner;

public class DimondPattrenMatching {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int s=n-1;
		while(s!=0) {
			for(int i=0;i<=s;i++) {
				System.out.print(" ");
			}
			for(int i=0;i<n-s;i++) {
				System.out.print(" *");
			}
			for(int i=0;i<=s;i++) {
				System.out.print(" ");
			}
			s--;
			System.out.println("");
		}
		while(s!=n) {
			for(int i=0;i<=s;i++) {
				System.out.print(" ");
			}
			for(int i=0;i<n-s;i++) {
				System.out.print(" *");
			}
			for(int i=0;i<=s;i++) {
				System.out.print(" ");
			}
			s++;
			System.out.println("");
		}
	}
}
