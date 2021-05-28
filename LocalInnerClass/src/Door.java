
public class Door {

	public boolean isLocked(String key) {
			class Lock {
				public boolean isLocked(String key) {
					if(key.contentEquals("qwerty")) {
						return false;
					}
					else 
						return true;
				}
			}
			return new Lock().isLocked(key);
			
	}
}
