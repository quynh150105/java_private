package BTVN_B3;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		System.out.print("Student_code: ");
		st.setStudentCode(sc.nextLine());
		System.out.print("FullName: ");
		st.setFullName(sc.nextLine());
		System.out.print("Age: ");
		st.setAge(sc.nextByte());
		sc.nextLine();
		System.out.print("Gender: ");
		st.setGender(sc.nextLine());
		System.out.print("PhoneNumber: ");
		st.setPhoneNumber(sc.nextLine());
		System.out.print("Email: ");
		st.setEmail(sc.nextLine());
		
		st.display();
		
	}

}
