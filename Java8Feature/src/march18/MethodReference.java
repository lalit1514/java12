package march18;
interface Hello{
	void hi();
}
class HelloInfo{
	static void dispSomething() {
		System.out.println("This is static method");
	}
}
public class MethodReference {

	public static void main(String[] args) {
		Hello h1=HelloInfo::dispSomething;
		h1.hi();
	}

}
