package lambdas;
// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
// Sintaxe : http://www.java2s.com/Tutorials/Java/java.util.function/BinaryOperator/index.htm
import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));

		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
		System.out.println(calc2.apply(2, 3));
		
		calc = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));
	}
}
