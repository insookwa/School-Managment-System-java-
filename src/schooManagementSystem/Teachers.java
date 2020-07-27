package schooManagementSystem;
/**
 * class responsible for keeping track of teachers name id and the salary 
 * @author Insookwa
 *
 */

public class Teachers {
	 int id;
	 String name;
	int salary;
	int salaryEarned;
	

public Teachers(int id, String name, int salary) {
	
	this.id = id;
	this.name=name;
	this.salary=salary;
	this.salaryEarned=0;
	
}





//teachers credentials getters 
public int getId() 
{
return id;	
}

public String getName() 
{
	return name;
}

public int getSalary() {
	return salary;
}
//teachers credentials setter

public void setSalary(int salary) 
{
	this.salary=salary;
	
			}

//adds to salary
//removes from total money earned of the school class 
//updates money spent

public void recivePayments(int salary) 
{
	salaryEarned = salary+ salaryEarned;
	School.updateTotalMoneySpent(salary);
	
}

@Override

public String toString() {
	return "Teacher's Name:"+name+" Salary earned sofar:$" + salaryEarned;
	
}

}
