package AbstractClass;

public class Staff extends Employee{
	String title;
	public Staff(String name, String phoneNumber, String emailAddress, String department, double salary,
			double datehired, String title) {
		super(name, phoneNumber, emailAddress, department, salary, datehired);
		this.title=title;
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

	@Override
	public double CalculateBonus() {
		return 0.06* this.salary;}
	public double CalculateVacation() {
		int holiday=3;
		if(datehired>=365*5) {
			holiday +=1;
		}
		return holiday;
	}}
