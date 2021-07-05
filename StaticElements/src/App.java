
public class App {

	public static void main(String[] args) {
		System.out.println(TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(1);
		System.out.println(TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(24);
		System.out.println(TestStatic.getStaticVariable());
		
	}

}
