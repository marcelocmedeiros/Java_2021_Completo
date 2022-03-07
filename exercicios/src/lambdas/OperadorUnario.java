package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

// Represents an operation on a single operand that produces a result of the same type as its operand.
public class OperadorUnario {

	public static void main(String[] args, Function<Integer, Integer> compose) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(resultado1);
		
		int resultado2 = compose
				.apply(0);
		System.out.println(resultado2);
	}
}
