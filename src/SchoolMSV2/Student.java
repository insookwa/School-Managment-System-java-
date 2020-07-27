package SchoolMSV2;

import java.util.Scanner;

public class Student {
	private String name;
	private int gradeYear;
	private String StudentID;
	private String courses = null;
	private int TutionBalance =0;
	private int costOfCourse = 600;
	private int id =1000;
	
	
	
	// ask student name and year
	Student()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Students name ");
		this.name = in.nextLine();
		System.out.println("Enter \n1 for year one \n2 for year two \n3 for year three \n4 for year four  ");
		this.gradeYear = in.nextInt();
		generateID();
		System.out.println("Student Name: "+ name + "\nGrade Year: "+gradeYear+"\nStudent ID: "+StudentID);
		
		
		
		
	}
	
	//generate an ID
	public void generateID() 
	{
		id++;
		this.StudentID=gradeYear+""+id;
		
		
	}
	// enroll courses
	
	public void enroll() 
	{
		//user enters 0 when they are done enrolling 
		do {
		System.out.print("Enter corse to enroll (Enter Q to quit )");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q"))
		{
			courses =courses+"\n"+course;
			TutionBalance = TutionBalance + costOfCourse;
			
		}
		else {break;}
		}while(1 != 0);
		
		System.out.println("ENROLLED IN: "+ courses);
		System.out.println("TUITION BALANCE " + TutionBalance);
	}
	
	
	//view balance and pay tuition 
	
	public void viewBalance() 
	{
		System.out.println("Your Balance is : $"+TutionBalance);
	}
	
	//make payment 
	
	public void payTution() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount of money you want to Pay");
		int payment = in.nextInt();
		TutionBalance = TutionBalance-payment;
		System.out.println("Thank you for payment of $:"+ payment);
		viewBalance();
	}
	//print status 

	public String toString() 
	{
		return "Name: "+ name + "\nyear: "+gradeYear + "\nBalance: $"+TutionBalance + "\nCourses Enrolled: "+courses;
		
	}
}
