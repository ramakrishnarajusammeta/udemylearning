
public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		if(door.getLock().isUnlocked("test")) {
			System.out.println("Welcome, we are open");
		}
		else {
			System.out.println("We are closed, visit again");
		}
	}

}
