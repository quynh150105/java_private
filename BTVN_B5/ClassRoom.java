package BTVN_B5;
import java.util.*;

public class ClassRoom {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Student> ds = new ArrayList<Student>();
	
	public static void inputList() {
		while(true) {
			Student a = new Student();
			System.out.println("Input Student!");
			a.input();
			if(a.getId() == 555)
				break;
			ds.add(a);
		}

	}

	public static void outputList() {
		System.out.printf("%-15s %-18s %-15s %-15s %-15s %-15s %-15s %-15s \n ","Name","Age","Commune","District","City","Id","NameClass","Gpa");
		for(Student a : ds) {
			a.output();
		}
	}
	
	public static void sortByGpa() {
		Collections.sort(ds, new Comparator<Student>(){
			@Override
			public int compare(Student a1, Student a2) {
				return Float.compare(a1.getGpa(), a2.getGpa());
			}
			
		});
	};
	
	public static void deleteById() {
		System.out.print("Input id: ");
		int id = sc.nextInt();
		boolean check = false;
		for(int i = 0; i< ds.size(); i++) {
			if(ds.get(i).getId() == id) {
				check = true;
				ds.remove(i);
				System.out.println("DeleteById Complete!");
			}	
		}
		if(!check) {
			System.out.println("Can not found!");
		}
	}
	
	public static void Menu() {
		while(true) {
			System.out.println("1, Input Student!");
			System.out.println("2, Output Student!");
			System.out.println("3, Sort by Gpa!");
			System.out.println("4, Delete by Id!");
			System.out.println("5, Exit!");
			System.out.print("Choose option: ");
			int option = sc.nextInt();
			switch(option) {
				case 1: 
					System.out.println("-------------------------------------------------------------");
					inputList();
					System.out.println("-------------------------------------------------------------");
					break;
				case 2:
					System.out.println("-------------------------------------------------------------");
					System.out.println("OutputList: ");
					outputList();
					System.out.println("-------------------------------------------------------------");
					break;
				case 3: 
					System.out.println("-------------------------------------------------------------");
					sortByGpa();
					System.out.println("SortByGpa Complete!");
					System.out.println("-------------------------------------------------------------");
					break;
				case 4:
					System.out.println("-------------------------------------------------------------");
					deleteById();
					System.out.println("-------------------------------------------------------------");
					break;
				case 5: 
					System.exit(0);
			}
			
		}
	}
	
	public static void fakeData() {
		Address ad1 = new Address("abc","Ba Vi","Ha Noi");
		Student st1 = new Student("Quynh",19,ad1,132,"HIT_Java",3.9f);
		ds.add(st1);
		Address ad2 = new Address("abc","Ba Vi","Ha Noi");
		Student st2 = new Student("A",19,ad2,123,"HIT_Java",3.2f);
		ds.add(st2);
		Address ad3 = new Address("abc","Ba Vi","Ha Noi");
		Student st3 = new Student("B",19,ad3,321,"HIT_Java",3.3f);
		ds.add(st3);
		Address ad4 = new Address("abc","Ba Vi","Ha Noi");
		Student st4 = new Student("C",19,ad4,213,"HIT_Java",2.9f);
		ds.add(st4);
		Address ad5 = new Address("abc","Ba Vi","Ha Noi");
		Student st5 = new Student("D",19,ad5,312,"HIT_Java",3.0f);
		ds.add(st5);
	}

	public static void main(String[] args) {
		fakeData();
		Menu();
	}

}
