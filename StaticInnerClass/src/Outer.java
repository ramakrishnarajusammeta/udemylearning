
public class Outer {

	private static int testVar = 5;
	public static void testOuterMethod() {
		System.out.println("From Outer Method, value of inner class variable" + Inner.x);
		Inner.testingInnerMethod();
	}
	public static class Inner {
		public static int x =0;
		public static void testingInnerMethod() {
			System.out.println("Testing Inner Class Method");
			System.out.println("Test variable value : " + testVar);
			

		}
	}
}
