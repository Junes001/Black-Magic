package AbstractClass;

public abstract class Employee extends Person {
	String department;
	double salary;
	double datehired;
	public Employee(String name,String phoneNumber,String emailAddress,String department,double salary,double datehired) {
		super(name,phoneNumber,emailAddress);
		this.department=department;
		this.salary=salary;
		this.datehired=datehired;
		
		
	}
	  public double getDate_hired() {
	        return datehired;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setDatehired(double datehired) {
	        this.datehired = datehired;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }
	    public abstract double CalculateBonus();
	    public abstract double CalculateVacation();
	
	
}
