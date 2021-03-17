package java_3.lambda_stream;

import java.util.List;

public class LambdaMain {


	public static void main(String[] args) {

		//Animals*******************
		//complete the static methods on the Animals class
		//use streams wherever possible in your method implementations.


		//Numbers********************
		//1. complete the static methods in the Numbers class.
		//2. solve the same challenges but allow the methods to accept lambda expressions as parameters.
		// You could potentially create one method that can do most of the computations in the Numbers class by simply passing in a lambda expression.

		Computation summing = (List<Integer> numbers) -> numbers.stream().mapToInt(number -> number).sum();
		Even even = (int i) -> i % 2 == 0;
		Odd odd = (int i) -> i % 2 != 0;

		System.out.println(Numbers.added(summing));
		System.out.println(Numbers.isEven(5,even));
		System.out.println(Numbers.isOdd(5,odd));
			/* e.g.
			Numbers.lambdaCompute((x,y) -> x + y)) => 5661
			Numbers.lambdaCompute( (x,y) -> x - y)) => -5641
			Numbers.lambdaCompute((x,y) -> x * y)) => -1767899136
			Numbers.lambdaCompute(() -> ... ) => 2500
			etc...
			*/
	}

}
