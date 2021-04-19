package observerHW;

public class ObserverMain {

	public static void main(String[] args) {


		Stock stock = new Stock();
		
		Observer client1 = new stockClient("Alexia Altman");
		Observer client2 = new stockClient("Maren Moldevau");
		Observer client3 = new stockClient("Sam Bjornson");
		Observer client4 = new stockClient("Tiffany Cook");
		Observer client5 = new stockClient("Barney Stinson");
		
		stock.buy(client1);
		stock.sell(client2);
		stock.buy(client3);
		stock.sell(client4);
		stock.buy(client5);
		
		stock.setStock("Stock market update: expected fall in price of Doge crypto");
		stock.setStock("Stock market update: expected rise of price in Mina crypto");

	}

}
