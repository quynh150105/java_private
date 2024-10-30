package Bai2;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n+1];
		a[1] = sc.nextInt();
		for(int i = 2; i<=n; i++) {
			a[i] = sc.nextInt();
			a[i] += a[i+1];
		}
		
		int q = sc.nextInt();
		while(q != 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(a[r] - a[l-1]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
