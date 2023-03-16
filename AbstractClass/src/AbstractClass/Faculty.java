package AbstractClass;

public class Faculty extends Employee {
	String officehours;
	String rank;
	public Faculty(String name, String phoneNumber, String emailAddress, String department, double salary,
			double datehired,String officehours,String rank) {
		super(name,phoneNumber,emailAddress,department,salary,datehired);
		this.officehours=officehours;
		this.rank=rank;
		// TODO Auto-generated constructor stub
	}
	public String getOffice_hours() {
	        return officehours;
	    }

	    public String getRank() {
	        return rank;
	    }

	    public void setRank(String rank) {
	        this.rank = rank;
	    }

	    public void setOffice_hours(String officehours) {
	        this.officehours = officehours;
	    }
	@Override
	public double CalculateBonus() {
		return 1000 + 0.05 * this.salary;}
	@Override
	public double CalculateVacation() {
		double holiday=4;
		if (rank=="Senior Lecturer"){
			holiday+=1;
		}
		if(datehired>=365*3) {
			holiday +=1;
		}
		return holiday;
	}
	
	}

