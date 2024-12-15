package Kthp;
import java.util.*;

public class IEmployeeManagerImpl implements IEmployeeManager{

	ArrayList<Employee> ds = new ArrayList<>();
	
	@Override
	public void addEmployee(Employee e) {
		boolean check = false;
		for(Employee employee : ds) {
			if(employee.getId().equals(e.getId())) {
				System.out.println("Id nhan vien da ton tai!");
				return;
			}		
		}
		ds.add(e);
		System.out.println("Add successfull! ");
		
	}

	@Override
	public void editEmployee(Employee e) {
		for(Employee employee : ds) {
			if(employee.getId().equals(e.getId())) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Name: ");
				e.setName(sc.nextLine());
				System.out.print("FullName: ");
				e.setFullName(sc.nextLine());
				System.out.print("Cosalary: ");
				e.setCosalary(sc.nextFloat());
				System.out.print("Basic_salary: ");
				e.setBasic_salary(sc.nextInt());
				sc.nextLine();
				System.out.print("Department: ");
				e.setDepartment(sc.nextLine());
				System.out.println("Edit successfull!");
			}
		}
	}

	@Override
	public void searchEmployee(String fullName) {
		for(Employee employee : ds) {
			if(employee.getFullName().equals(fullName)) {
				System.out.println("Search successfull!");
				employee.display();
				return;
			}
		}
		System.out.println("Search Error!");
		
	}

	@Override
	public float getTotalSalary() {
		float TotalSalary = 0;
		for(int i = 0; i< ds.size(); i++) {
			TotalSalary += ds.get(i).getSalary();
		}
		System.out.print("Tong Luong: ");
		return TotalSalary;
	}
	
	public void display() {
		System.out.println("Danh sach nhan vien: ");
		for(Employee employee: ds) {
			employee.display();
		}
	}

}
