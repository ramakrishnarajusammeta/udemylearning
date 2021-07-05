
public  class TestStatic {
	private static int staticVariable = 0;

	public static int getStaticVariable() {
		return TestStatic.staticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		TestStatic.staticVariable = staticVariable;
	}
}
