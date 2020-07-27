package schooManagementSystem;

import java.util.*;

public class Main {
	
	public static void main(String args[]) 
	{
		Teachers lizzy = new Teachers(1, "lizzy", 600);
		Teachers melisa = new Teachers(1,"melisa",500);
		Teachers Banny = new Teachers(1,"Banny",500);
		
		List<Teachers> teachersList = new ArrayList<>();
		
		teachersList.add(lizzy);
		teachersList.add(melisa);
		teachersList.add(Banny);
		
		Students jenny = new Students(1,"Jenny",3);
		Students ivan = new Students(2,"ivan",12);
		Students suzie = new Students(3,"suzie",11);
		 
		List<Students> StudentsList = new ArrayList<>();
		StudentsList.add(jenny);
		StudentsList.add(ivan);
		StudentsList.add(suzie);
		
		School mhs=new School(teachersList,StudentsList);
		
		jenny.payFees(7000);
		ivan.payFees(5000);
		System.out.println("MHS has earned $"+ mhs.getTotalMoneyEarned());
		
		System.out.println("-------MHS paying salary----------\n");
		lizzy.recivePayments(lizzy.getSalary());
		System.out.println("MHS has paid money to " + lizzy.getName());
		System.out.println("The school now has $"+mhs.getTotalMoneyEarned());
		
		System.out.println("-------MHS paying salary----------\n");
		melisa.recivePayments(melisa.getSalary());
		System.out.println("MHS has paid money to " + melisa.getName());
		System.out.println("The school now has $"+mhs.getTotalMoneyEarned());
		
		System.out.println(ivan);
		System.out.println(lizzy);
		System.out.println(melisa);
	}
	

}
