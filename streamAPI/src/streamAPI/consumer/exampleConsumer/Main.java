package streamAPI.consumer.exampleConsumer;

import java.util.*;
import java.util.function.*;
public class Main {
	public static void main(String[] args) {
	User user1 = new User("Antonio", 230, false);
	User user2 = new User("Anna", 270, false);
	User user3 = new User("Gabriel", 567, true);
	User user4 = new User("Marcia", 480, false);
	User user5 = new User("Rogerio", 675, true);
	
	List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
	
	// com uma class anonima
	ShowAttr attrName = new ShowAttr();
	users.forEach(attrName);
	
	System.out.println("");
	
	// modeo direto
	Consumer<User> attrScore = (User u) -> {
		System.out.println(u.getScore());
	};
	
	users.forEach(attrScore);
	
	System.out.println("");
	
	// modo simples com o uso apenas do lambda
	users.forEach(u -> System.out.println(u.getName()));
	
	}
	
	
}
