package BTVN_B1;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Arrays = new int[5];
		for(int i = 0; i < Arrays.length; i++) {
			Arrays[i] = sc.nextInt();
		}
		int max1 = Arrays[0];
		int max2 = max1;
		for(int x : Arrays) {
			if(x > max1) {
				max2 = max1;
				max1 = x;
			}
			else if (x > max2) {
				max2 = x;
			}
		}
		System.out.println(max1);
		System.out.println(max2);
	}

}
