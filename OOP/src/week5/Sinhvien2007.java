package week5;

public class Sinhvien2007 extends Students{
	public double good_mark;
	public Sinhvien2007(String name, int age, String sex, double informatics_mark, double english_mark,
			double philosophy_mark, String scholarship,double good_mark) {
		super(name, age, sex, informatics_mark, english_mark, philosophy_mark, scholarship);
		this.good_mark=good_mark;
		
	}
	public double scholarship() {
		mark=(informatics_mark+english_mark+philosophy_mark+good_mark)/4;
		return super.scholarship();}
	public void out() {
		super.out();
		System.out.println("good_mark:"+this.good_mark);

	}

}
