package m1ex;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		
		long sum =0;
		
		if(first<last) {
		for (int i=first;i<last+1;i++) {
			sum+=i;
		}
		return sum;
		}else if(first==last) {
			return first;
		}
		return 0;
	}
	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		
long sum =0;
		
		if(first<last) {
		for (int i=first;i<last+1;i++) {
			if (i%2==0) {
			sum+=i;
		}
		}
		return sum;
		}
		else if(first==last) {
		return first;
		}
		return 0;
	}
		
	/**
	 * Square root using Newton method
	 * Epsilon should be set to 0.001
	 *  
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {
	    // TODO
	    return 0.0;
	}

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
		
		long fact=1;
		if(value>0) {
		for(int i=value;i>0;i--) {
			fact*=i;
		}
		return fact;
		}
		return 0;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		// TODO
		return 0;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[0][0];

	if(value!=0) {
		for (int i=0;i<value;i++) {
		for(int j=0;j<value;i++) {
			result[i][j]=(i+1)*(j+1);
		}
	}
		return result;
	}
	
		return result;
		}
	}
	


