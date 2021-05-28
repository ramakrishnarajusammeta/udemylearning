import org.rk.Nokia;
import org.rk.Phone;
import org.rk.Samsung;

public class Hello {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone nokia3310 =  new Hello().phone(1);
		System.out.println(nokia3310.getModel());
		nokia3310.features();
		
		Phone note8 = new Hello().phone(2);
		System.out.println(note8.getModel());
		note8.features();
	}
	
	// if we keep static here, we an directly invoke phone(1)
	public Phone phone(int dailyDriver) {
		switch (dailyDriver) {
		case 1 : return new Nokia("3310");
		case 2 : return new Samsung("Note 8");
		}
		return null;
	}

}
