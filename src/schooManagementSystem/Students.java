package schooManagementSystem;

/*class to take care of students fees, name grade and fees 
 * 
 * */


public class Students {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	
	public Students(int id , String name, int grade) {
		this.feesTotal=30000;
		this.feesPaid = 0;
		this.id=id;
		this.name =name;
		this.grade=grade;
	}
	//students credentials setters
	
	public void setGrade(int grade) 
	{
		this.grade=grade;
	}
	public void payFees(int fees)
	{
		feesPaid = feesPaid+fees;
		School.updateMoneyEarned(feesPaid);
		
	}
	
	//students  credentials getters 

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	
	//get remaining fees 
	
 public int getRemainingFees() {
	 
	return feesTotal - feesPaid;
 }
 
	@Override
	public String toString() {
		return "Students name:"+name+" fees paid:$" + feesPaid;
	}
	

}
