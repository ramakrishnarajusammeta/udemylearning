
public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*OnePlus5 phone = new OnePlus5();
		int processor = phone.processor();
		System.out.println("Processor : "+processor);*/
		
		Phone phone1 = new OnePlus5();
		System.out.println("Processor : " + phone1.processor());
		
		Phone phone2 = new IPhone8();
		System.out.println("Processor : " + phone2.processor());
		
	}

}
