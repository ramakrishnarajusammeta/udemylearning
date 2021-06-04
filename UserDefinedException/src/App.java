import java.io.FileNotFoundException;


class UserDefinedException extends Exception {
	
}

public class App {

	public static void main(String[] args)  {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("catch block of main method");
		} catch (UserDefinedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public static void someMethod() throws Exception {
		int x = 3;
		
		switch (x) {
		case 1:
				throw new FileNotFoundException();
		case 2 :
				throw new Exception();
		default : 
				throw new UserDefinedException();
		}
	}
}
