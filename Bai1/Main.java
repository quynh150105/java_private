package Bai1;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a: ");
		int a = sc.nextInt();
		System.out.print("nhap b: ");
		int b = sc.nextInt();
		System.out.print("nhap c: ");
		int c = sc.nextInt();
		if(a+b>c && a+c>b && c+b>a) {
			System.out.println("day la tam giac");
		}
		else {
			System.out.println("day khong la tam giac");
		}
		
		
		
		
		
		
		
	}
}
