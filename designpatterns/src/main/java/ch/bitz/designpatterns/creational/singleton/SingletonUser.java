package ch.bitz.designpatterns.creational.singleton;

public class SingletonUser {
	private EagerSingleton eagerSingleton;

	public SingletonUser(EagerSingleton eagerSingleton) {
		this.eagerSingleton = eagerSingleton;
	}
	
	// so kannst du ein Singleton nutzen
	public SingletonUser() {
		this.eagerSingleton = EagerSingleton.getInstance();
	}
	
	public static void main(String[] args) {
		// müsste auf packaged geändert werden:
		// EagerSingleton eagerSingleton = new EagerSingleton();
		// SingletonUser singletonUser1 = new SingletonUser(eagerSingleton);
		// SingletonUser singletonUser2 = new SingletonUser(eagerSingleton);
		
		SingletonUser singletonUser3 = new SingletonUser();
		SingletonUser singletonUser4 = new SingletonUser();
	}
	
	
}
