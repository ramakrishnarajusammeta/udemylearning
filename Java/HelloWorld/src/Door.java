
public class Door {

		public boolean isLocked (String key) {
			
			class Lock {
					public boolean isLocked1(String key) {
						if (key.equals("querty")) {
							return false;
						} else {
							return true;
						}
					}
			}
			
			return new Lock().isLocked1(key);
		}
}
