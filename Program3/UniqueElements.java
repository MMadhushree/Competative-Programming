package college;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		Set<Integer> s = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements to be inserted: ");
		int n=scan.nextInt();
		int ele;
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			ele=scan.nextInt();
			a.add(ele);
			s.add(ele);
		}
		System.out.println(a.size()-(a.size()-s.size()));//To find the number of duplicate elements.
		scan.close();
	}
}
