package restapitests;

import org.testng.annotations.Test;

public class RestAPITest {
	
	@Test (groups= {"SANITY"})
	public void RESTSanity1Test() {
		System.out.println("RESTSanity1Test success");
	}


	@Test (groups= {"SANITY"})
	public void RESTSanity2Test() {
		System.out.println("RESTSanity2Test success");
	}

	@Test (groups= {"SMOKE"})
	public void RESTRegression1Test() {
		System.out.println("RESTRegression1Test success");
	}
	
	@Test (groups= {"SMOKE"})
	public void RESTRegression2Test() {
		System.out.println("RESTRegression2Test success");
	}
}
