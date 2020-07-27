package schooManagementSystem;

import java.util.List;

/**
 * 
 * @author Insookwa
 * class to manage the school . teachers and students .
 *
 */

public class School {
	
	private List<Teachers> teacher;
	private List<Students> student;
	private static int   totalMoneyEarned;
	private static int totalMoneySpent;
	
	//new school object constructor. list of students and teacher 
	public School(List<Teachers> teacher, List<Students> student) {
		
		this.teacher = teacher;
		this.student = student;
		totalMoneyEarned = 0;
		totalMoneySpent =0;
	}

	
	  
	// return the list of teachers 
	public List<Teachers> getTeacher() {
		return teacher;
	}

	// add a teacher to the school
	public void addTeacher(Teachers Teacher) {
		teacher.add(Teacher);
	}
	
	

	//return a list of students 
	public List<Students> getStudent() {
		return student;
	}

	// add a student to the list of students 
	public void addStudent(Students Student) {
	 student.add(Student);
	}

	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	//update the money earned everytime someone pays or a payment is recived 
	public static void  updateMoneyEarned(int MoneyEarned) {
		totalMoneyEarned = totalMoneyEarned+MoneyEarned;
	}
	
	
//returns total money spent by the school
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	//update the money spent// whenever a teacher is paid salary 

	public static void updateTotalMoneySpent(int MoneySpent) {
		
		totalMoneyEarned = totalMoneyEarned-MoneySpent;
	}
	
	
	
	
	
	
	

}
