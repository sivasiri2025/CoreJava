package java8features;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpression {

	public static void main(String[] args) {
		int width = 10;
		
		//without lamdba
		Drawble d = new Drawble() {
			public void draw() {
				System.out.println("drawing "+ width);
			}
		};
		d.draw();
		
		//with lamdba
		Drawble d1 = () -> {
			System.out.println("using lamdba drawing "+ width);
		};
		d1.draw();
		
		// few funcational interfaces which has only abstract methods. 
		//Predicate
		//Consumer<T>

	}

}
