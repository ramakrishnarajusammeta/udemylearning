
public class Demo {

	public static void main(String[] args) {
		
		
		Learning learn = Learning.COLLECTIONS;
	
		switch(learn) {
			case COLLECTIONS:
				System.out.println("Step 2 : Learning Collections");
				break;
			case COREJAVA:
				System.out.println("Step 1 : Learning Core Java");
				break;
			case GENERICS:
				System.out.println("Step 4 : Learning Generics");
				break;
			case JSPANDSERVLETS:
				System.out.println("Step 3 : Learning JSP and Servlets");
				break;
			case MULTITHREADING:
				System.out.println("Step 3 : Learning Multithreading");
				break;
			default:
				break;
		
		}
		
	}

}
