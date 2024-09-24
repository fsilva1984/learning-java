package streamAPI.consumer.exampleConsumer;

import java.util.function.Consumer;

public class ShowAttr implements Consumer<User> {

	@Override
	public void accept(User t) {
		System.out.println(t.getName());
	}
	
}
