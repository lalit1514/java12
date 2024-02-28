package feb28;
class Animal{
	void eat() {
		System.out.println("Animal class");
	}
	
}
class Dog extends Animal{
	String color="brown";
	void dispcolor() {
		System.out.println("Dog color:"+color);
		
	}
}
class Cat extends Dog{
	void bark() {
		System.out.println("Cat is Barking");
		
	}
}
class BabyDog extends Dog{
	String age="2Months";
	void dispAge() {
		System.out.println("The age of baby dog is:"+age);
		
	}
}
public class HybrideInheritance {

	public static void main(String[] args) {
Cat c1=new Cat();
c1.bark();
c1.eat();
BabyDog b1=new BabyDog();
b1.dispAge();
b1.dispcolor();


	}

}
