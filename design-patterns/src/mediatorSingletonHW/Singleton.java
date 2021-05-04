package mediatorSingletonHW;

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInctance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance; 
	}
	
	public void postMessage(String message) {
		System.out.println("Forbiden word: " + message);
	}

}
