package SchoolMSV2;

import java.util.Scanner;

public class StudentDatabaseApp {
	
	public static void main(String args[]) 
	{
		
		
		System.out.println("Enter number of Students you want to enroll");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for(int n=0; n<numOfStudents; n++) 
		{
			students[n]= new Student();
			students[n].enroll();
			students[n].payTution();
			//System.out.print(students.toString());
		}
		
		System.out.println(students[0].toString());
		System.out.println(students[1].toString());

	}

}
