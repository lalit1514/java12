package march18;
interface calsi{
	public void calsiq(int x);
}
class A implements calsi{
	public void calsq(int x) {
		System.out.println(x*x);
	}

	@Override
	public void calsiq(int x) {
		// TODO Auto-generated method stub
		
	}
}
public class test1 {

	public static void main(String[] args) {
			A a1=new A();
			a1.calsq(10);
			
	}

}
