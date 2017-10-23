package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Lambdas2nd {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Fish", false,true));	// swims
		animals.add(new Animal("Kangaroo", true, false));
		animals.add(new Animal("Rabbit", true, false));
		animals.add(new Animal("Turtle", false, true));
		
		/* There are different ways of writing lambdas
		 * 
		 */
		print(animals, 
				a -> a.canSwim()	// short way
				);
		print(animals, 
				// TODO optional type between parenthesis () and braces {}
				(Animal a) -> { a.canSwim(); }	
				);

	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for(Animal a : animals){
			if(checker.test(a)){
				System.out.println(a + " ");
			}
		}
	}
	
}

interface CheckTrait {
	boolean test(Animal ani);
}
