package observerHW;

public interface Observable {

	void buy(Observer observer);
	void sell(Observer observer);
	
	void notifyObservers();
	
	String getUpdate();
	
}
