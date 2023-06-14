package e1_hibernate1.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentCrud crud=new studentCrud();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your id");
		int id=sc.nextInt();
		
	System.out.println("enter you name");
	String name=sc.next();
		
		System.out.println("enter you email");
		String email=sc.next();
		
		System.out.println("enter you password");
		String pwd=sc.next();
		
		System.out.println("enter you phone number");
		long phone=sc.nextLong();
		
		
		Student1 s=new Student1();
		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setPwd(pwd);
		s.setPhone(phone);
		
		crud.saveStudent(s);
		
		
	}

}
