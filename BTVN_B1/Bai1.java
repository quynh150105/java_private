package BTVN_B1;
import java.util.Scanner;

public class Bai1 {
	
	public static String Convert(int a, int b) {
		String s = "0123456789ABCDEF";
		String answer = "";
		while(a > 0) {
			answer = s.charAt(a%b) + answer;
			a /= b;
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b;
		do {
			b = sc.nextInt();
		}
		while(b<2 || b > 16);
		System.out.println("ket qua: " + Convert(a,b) );
	
	}
	
}
