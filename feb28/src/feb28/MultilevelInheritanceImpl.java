package feb28;
class Vehical{
	double speed(double s) {
		//System.out.println("speed of Vehical:"+s);
	return s;
	
	}
}
	class Car extends Vehical{
		String showcolor(String color) {
		return color;
	
		}
	}
class Bike extends Car{
	int showprice(int price) {
		return price;
	}
}
class Bycycle extends Bike{
	int ShowYearModel(int year) {
		return year; 
	}
}

public class MultilevelInheritanceImpl {

	public static void main(String[] args) {
		Bycycle b1=new Bycycle();
System.out.println("The speed of vehical is:"+b1.speed(9.5));
System.out.println("The color of car is:"+b1.showcolor("Black"));
System.out.println("The price of Bike is:"+b1.showprice(60000));
System.out.println("The model of Bycycle is:"+b1.ShowYearModel(2024));

	}

	}


