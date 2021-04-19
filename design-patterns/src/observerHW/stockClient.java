package observerHW;

public class stockClient implements Observer {
	
	private String name;
	private Observable owner;

	public stockClient(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.owner == null) {
			System.out.println(this.getName() + " user does not own stock and cannot receive updates!");
			return;
		}
		
		String stockUpdate = this.owner.getUpdate();
		System.out.println(this.getName() + ", you received an update: " + stockUpdate);
	}



	@Override
	public void setStock(Observable stock) {
		this.owner = stock;

	}
	private String getName() {
		return name;
	}
}
