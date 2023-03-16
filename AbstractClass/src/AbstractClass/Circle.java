//Ngo Ngoc Vuong 20206221
package AbstractClass;
public class Circle extends GeometricObject{
	    protected double radius;
	    public Circle(String color, double radius, double weight){
	        super(color, weight);
	        this.radius = radius;
	    }
	    @Override
	    public double findArea(){
	        return 3.14 * radius * radius;
	    }
	    @Override
	    public double findPerimeter(){
	        return 2 * 3.14 * radius;
	    }
	    @Override
	    public String toString() {
	    	return "Circle: "+this.color+"Weight:"+this.weight;
	    }
	    public void display(){
	        if(radius < 0 || weight<0){
	            System.out.println("Khong hop le, xin vui long nhap lai !");
	        }
	        else {
	            System.out.println("Mau cua hinh tron la: " + getColor());
	            System.out.println("Trong luong cua hinh tron la: " + getWeight());
	            System.out.println("Chu vi hinh tron la: " + findPerimeter());
	            System.out.println("Dien tich hinh tron la: " + findArea());
	        }
	    }
	    public static void main(String[] args) {
	        Circle c1 = new Circle("Pink", 3.34, 3.14);
	        c1.display();
	        Circle c2 = new Circle("Black",1.23, -3.14);
	        c2.display();
	}}

