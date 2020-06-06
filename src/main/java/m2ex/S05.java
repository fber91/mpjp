package m2ex;

public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		StringBuilder ribaltata = new StringBuilder("");
        for (int i = s.length() - 1; 0 <= i; i--) {
            ribaltata.append(s.charAt(i));
        }
        String result = ribaltata.toString();
        return result;
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		 if (s.length() % 2 != 0) {
	            return false;
	        }

	        int ultimo = s.length();
	        int meta =  ultimo/ 2;

	        for (int i = 0; i < meta; i++) {
	            if (s.charAt(i) != s.charAt(ultimo -i - 1)) {
	                return false;
	            }
	        }
	        return true;
	
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		// TODO

	           
		return "";
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		int sum = 0;
		int[] binario  = new int[s.length()];
		
		for (i=0;i<s.length();i++) {
			
			binario[i] = Character.getNumericValue(s.charAt(i));}
			
			for (i=0; i<binario.length;i++) {
				 sum = sum + (binario[i] *  Math.pow(2,binario-i-1));
			
			
		}
		return sum;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[0];

		// TODO

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		// TODO
		return 0;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		// TODO
		return Integer.MIN_VALUE;
	}
}
