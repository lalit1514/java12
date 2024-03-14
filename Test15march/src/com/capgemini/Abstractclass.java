package com.capgemini;
abstract class Bank{
	abstract void getRoi(double r);
	void show() {
		System.out.println("This is show method for Bank");
		
	}
}
class BankA extends Bank{
	void getRoi(double r) {
		System.out.println("Rate of BankA:"+r);
	}
}
public class Abstractclass {

	public static void main(String[] args) {
		BankA b1=new BankA();
		b1.getRoi(10.50);
		b1.show();
	}

}
