package week2;
//Ngo Ngoc Vuong 20206221
public interface shape {
	public enum Shape{
		hinhtron,hinhchunhat,tamgiac;

		}

	public class duongtron implements shape{
		private double r;

		public duongtron(double r) {
			this.r=r;
		}
		public double P() {
			return 3.14*r*2;
		}
		public double S() {
			return 3.14*r*r;
		}
	}
	public class hinhchunhat implements shape{
		public double a;
		public double b;
		public hinhchunhat(double a, double b) {
			this.a=a;
			this.b=b;
		}
		public double P() {
			return 2*a+2*b;
		}
		public double S() {
			return a*b;
		}
	}
	public class tamgiac implements shape{
		public double a;
		public double b;
		public double c;
		public tamgiac(double a, double b, double c) {
			this.a=a;
			this.b=b;
			this.c=c;
		}
		public double P() {
			return a+b+c;
		}
		public double S() {
			return (a+b+c)*(b+c)*(a+c)*(a+b)/16;
		}
		
	}
	
}
