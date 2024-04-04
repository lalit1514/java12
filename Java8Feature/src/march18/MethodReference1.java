package march18;
interface add{
	void a();
	
}
class add2{
	public void b() {
		System.out.println("This is b method");
	}
}
public class MethodReference1 {

	public static void main(String[] args) {
 
		add2 a1=new add2();
		//contaningobject::methodname
		add aa=a1::b;
		
		aa.a();
	}

}
