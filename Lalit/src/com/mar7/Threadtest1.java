package com.mar7;

public class Threadtest1 extends Thread {
public void run() {
	System.out.println("This is thread class run method");
	
}
public void disp() {
	System.out.println("This is disp method");
}
	public  static void main(String[] args) 
	{
Threadtest1 t=new Threadtest1();
//run();
t.start();
	}

}
