
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x = 10/0;
		}
		
		catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception Occured");
				System.out.println(e.getMessage());
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		} 
	}

}
