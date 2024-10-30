package BTVN_B2;
import java.util.Scanner;

public class Bai2 {
	
	
	    public static void nhapMang(int[] arr, int n) {
	        Scanner sc = new Scanner(System.in);
	        for (int i = 0; i < n; i++) {
	            int value;
	            boolean check;
	            do {
	                check = false;
	                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
	                value = sc.nextInt();
	                for (int j = 0; j < i; j++) {
	                    if (arr[j] == value) {
	                        System.out.println("phan tu da ton tai, nhap lai: ");
	                        check = true;
	                        break;
	                    }
	                }
	            } while (check);
	            arr[i] = value;
	        }
	    }
	    
	    public static void SapXep(int[] a, int n) {
	    	for(int i = 0; i< n; i++) {
	    		for(int j = i+1; j< n; j++) {
	    			if(a[i] > a[j]) {
	    				int temp = a[i];
	    				a[i] = a[j];
	    				a[j] = temp;
	    			}
	    		}
	    	}
	    }

	    
	    public static void xuatMang(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }

	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n;
	        do {
	            System.out.print("nhap nums.length: ");
	            n = sc.nextInt();
	        } while (n < 1 || n > 104);
	        int k;
	        do {
	            System.out.print("Nhap k: ");
	            k = sc.nextInt();
	        } while (k < -104 || k > 104);

	        int[] a = new int[n];

	        nhapMang(a, n);

	        xuatMang(a);
	        
	        SapXep(a,n);
	        
	        xuatMang(a);
	    }

}
