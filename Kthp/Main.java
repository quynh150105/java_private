package Kthp;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IEmployeeManagerImpl ds = new IEmployeeManagerImpl();
		Employee e1 = new Employee("01","quynh","LeNhuQuynh",1.3f,1400,"Congnghe");
		Employee e2 = new Employee("02","Quan","QuanLz",1.2f,1100,"Nhansu");
		//add employee
		ds.addEmployee(e1);
		ds.addEmployee(e2);
		//in danh sach employee
		ds.display();
		//search employee
		System.out.print("Nhap ten can tim: ");
		String fullName = sc.nextLine();
		ds.searchEmployee(fullName);
		//in ra TotalSalary
		System.out.println(ds.getTotalSalary());
		//edit thong tin Emmployee
		ds.editEmployee(e1);
		//hien danh sach sau khi edit
		ds.display();

	}

}
