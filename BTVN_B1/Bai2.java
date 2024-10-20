package BTVN_B1;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen: ");
		int n = sc.nextInt();
		int answer = 1;
		while(n > 0) {
			int a = n%10;
			answer*=a;
			n = n/10;
		}
		System.out.println("ket qua la: " + answer);
	}
}
