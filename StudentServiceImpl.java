package fine;

import java.util.Map.Entry;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService{

	@Override
	public void addStudent(Scanner sc) {
		System.out.println("Enter student name:");
		String name = sc.next();
		Student_List.put(name,new Student(name));
		System.out.println("Student added succesfulyy!!");
		
	}

	@Override
	public void get_StudentList() {
		for(Entry<String, Student> entry:Student_List.entrySet()) {
		System.out.println("");
		}
	}
	
	@Override
	public void setfine(String name,int fee) {
		Student_List.get(name).addfine(fee);
	}

	@Override
	public void viewfine(Scanner sc) {
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Your fee pending is:" + Student_List.get(name).getFine());
		
	}

	@Override
	public void payFine(Scanner sc) {
		System.out.println("Enter your name");
		String name = sc.next();
		Student_List.get(name).clearfine();
		System.out.println("Payment in process.."+"Payment is completed");
		
	}

}
