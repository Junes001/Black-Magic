package AbstractClass;

public abstract class Person {
	public String name;
	public String phoneNumber;
	public String emailAddress;
	public Person(String name,String phoneNumber,String emailAddress) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.emailAddress=emailAddress;
	}

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phoneNumber = phone;}
    @Override
    	public String toString() {
    		return "Name :"+this.name+"\n"+"PhoneNumber:"+this.phoneNumber+"\n"+"Email:"+this.emailAddress;
    		
    	}
//Ngo Ngoc Vuong 2020621
    
	public void main(String[] args) {
		Student s1=new Student("june","113","ale@gmail.com","Business");
		s1.toString();
	}}
	
	
	
