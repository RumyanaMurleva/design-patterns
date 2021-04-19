package observer;

public class ObserverMain {

	public static void main(String[] args) {
		
		Topic topic = new Topic();
		
		Observer obs1 = new TopicSubscriber("Topic subscriber 01");
		Observer obs2 = new TopicSubscriber("Topic subscriber 02");
		Observer obs3 = new TopicSubscriber("Topic subscriber 03");
		
		topic.subscribe(obs1);		
		topic.subscribe(obs2);		
		topic.subscribe(obs3);	
		
		topic.setTopic("Breaking news: bg elections 2021");
		topic.setTopic("Breaking news: Covid strikes");
	}

}
