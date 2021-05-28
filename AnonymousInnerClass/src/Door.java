
abstract class Lock {
	public abstract boolean isUnlocked(String keyCode);
	
}

public class Door {

	Lock lock = new Lock() {

		@Override
		public boolean isUnlocked(String keyCode) {
			if(keyCode.equals("qwerty")) {
				return true;
			} else {
			return false;
			}
		}
		
		
	};

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}
		
}