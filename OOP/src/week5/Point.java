package week5;
import java.util.Scanner;

public class Point {
	public double x[];
	public double n;
	public double space;
	private Object[] a;
	private double tong;
	 public Point(){
	   for (int i=0;i<n;i++) {
		   x[i]=0;
	   }
	    }
	public Point (double a[]) {
		for (int i=0;i<n;i++) {
			a[i]=a[i];
		}

		}
    public void getPoint(Scanner sc) {
        System.out.print("\tNhap so chieu: ");
        n = sc.nextDouble();
        for (int i=0;i<n;i++) {
        	System.out.print("\tNhap toa do: "+this.a[i]);
        	a[i] = sc.nextDouble();}}
	public void getSpace() {
		tong = 0;
		for (int i=0;i<n;i++) {
			tong+=Math.pow((double) a[i], 2);
		space=Math.sqrt(tong);
		System.out.println("Khoang cahc dn goc toa do:"+space);
		}
	}
	public void out() {
		for (int i=0;i<n;i++) {
			System.out.print("toa do : "+a[i]+"\t");}
	}}
	//Ngo Ngoc Vuong 20206221

