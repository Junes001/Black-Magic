package week2;

import week2.shape.duongtron;
import week2.shape.hinhchunhat;
import week2.shape.tamgiac;

public class main {
	public static void main(String[] args) {
		tamgiac tg=new tamgiac(3.5,6.5,9.2);
		System.out.println("chu vi tam giac la "+tg.P());
		System.out.println("chu vi tam giac la "+tg.S());
		hinhchunhat hcn=new hinhchunhat(2,5);
		System.out.println("chu vi hinh chu nhat la "+hcn.P());
		System.out.println("dien tich hinh chu nhat la "+hcn.S());
		duongtron dt=new duongtron(2);
		System.out.println("chu vi duong tron la "+dt.P());
		System.out.println("dien tich duong tron la "+dt.S());
		
	}
}
