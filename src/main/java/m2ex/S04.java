package m2ex;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		int[] array = new int[last];
		int sum = 0;
		if (last < first)
			return 0;
		else

			for (int i = first; i <= last; i++) {
				sum = sum + array[i];
			}
		return sum;

	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		int[] array = new int[last];
		int sum = 0;
		for (int i = first; i <= last; i++) {
			if (array[i] % 2 == 0) {
				sum = sum + array[i];
			}
		}

		return sum;
	}

	/**
	 * Square root using Newton method Epsilon should be set to 0.001
	 * 
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {
		
	value = Math.abs(value);
		double epsilon;
		double root =value;
		double next_root = 0.5 * (root + (value/root));
		if (value == 0) {
			return 0;
		}
		while ( next_root - root > epsilon) {
			root = next_root;
			next_root = 0.5 * (root + (value/root));
		}
		
		return next_root;}
		

	/**
	 * Square root using Newton method
	 * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
	public static double sqrt(double value, double epsilon) {
		// TODO
		return 0.0;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		int fatt = 0;
		if (value < 0) {
			return 0;
		} else
			while (value != 1) {
				fatt = value * (value - 1);
				value--;
			}
		return fatt;

	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		int[] array = new int[value];
		array[0] = 0;
		array[1] = 1;
		for (int i = 0; i < value; i++) {

			array[i] = array[i - 1] + array[i - 2];

		}
		return array[value];
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		
		int[][] result = new int[value][value];
		
		
		for(i=0;i<value;i++) {
			for(j=0;j<value;j++) {
				result[i][j] = (i+1) * (j+1);
			}
		}
		

		return result;
	}

