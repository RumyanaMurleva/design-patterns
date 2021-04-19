package observerHW;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Observable {
	
	private List<Observer> clients;
	private String stock;

	public Stock() {
		this.clients = new ArrayList<>();
	}

	@Override
	public void buy(Observer observer) {
		this.clients.add(observer);
		observer.setStock(this);

	}

	@Override
	public void sell(Observer observer) {
		this.clients.remove(observer);

	}

	@Override
	public void notifyObservers() {

		for(Observer observer: this.clients) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.stock;
	}
	
	public void setStock(String stock) {
		this.stock = stock;
		this.notifyObservers();
	}

}
