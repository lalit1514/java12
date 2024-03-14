package com.capgemini;
class Vehicle{
	void speed(int s) {
		System.out.println("Speed of vehicle:"+s);
	}
}
class Car extends Vehicle{
	void speed(int s) {
		super. speed(120);
		System.out.println("Speed of Car:"+s);
		
	}
}
class Bus extends Vehicle{
	void speed(int s) {
		
		System.out.println("speed of Bus"+s);
		
	}  
}
class Bycycle extends Car{
	void speed(int s) {
		
		System.out.println("speed of Bycycle"+s);
		
	}
}
public class Test2superclass {

	public static void main(String[] args) {
Vehicle v1,v2,v3;
		v1=new Car();
		v2=new Bus();
		v3=new Bycycle();
		
		v1.speed(80);
		v2.speed(100);
		v3.speed(20);
		
	}


}
