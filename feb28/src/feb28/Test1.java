package feb28;
class AccountHolder{
	
	void info(String accNo,String name) {
		System.out.println("Account Number:"+accNo+"\nString name:"+name);
	}
}
class Bank extends AccountHolder
{
	void getRoi(double roi) {
		System.out.println("Bank interest:"+roi);
	}
}
public class Test1 {

	public static void main(String[] args) {
   //AccountHolder a1=new AccountHolder();
   //a1.info("123","sujay");
   Bank b1=new Bank();
   b1.getRoi(5.6);
b1.info("124","lalit");

	}
}

