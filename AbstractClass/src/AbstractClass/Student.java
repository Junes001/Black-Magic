package AbstractClass;

public class Student extends Person{
	public String event;
	public Student(String name,String phoneNumber,String emailAddress,String event) {
		super(name,phoneNumber,emailAddress);
		this.event=event;
	}

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
	 
}}
