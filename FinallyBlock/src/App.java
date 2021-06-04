
public class App {

	public static void main(String[] args) {
		int x = 2;
		
		try {
				System.out.println("We don't know, what will be the outcome of "+ x/2);
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception");
		} catch (Exception e) {
			System.out.println("Exception !!!");
		}
		finally {
				System.out.println("This will be printed");
		} 

	}

}
