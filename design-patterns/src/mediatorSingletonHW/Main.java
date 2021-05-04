package mediatorSingletonHW;

public class Main {

	public static void main(String[] args) {
		
		Singleton connection = Singleton.getInctance();
		if(message = "cat") {
			connection.postMessage("cat");
		}
	
		//I know it`s wrong, but I`m not sure how to do the bot

		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Gosho");
		User user2 = new ChatUser(chat, "Tosho");
		User user3 = new ChatUser(chat, "Losho");
	
		user1.send("koshka");
		user2.send("kitty");
		user3.send("cat");

	}
}
