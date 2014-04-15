package problems;

public class Problem007 {

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * What is the 10 001st prime number?
	 */
	
	public static void main(String[] args) {
		// include 2 as already accounted for then start at the next prime number: 3
		int numOfPrimes = 1;
		int num = 3;
		while(numOfPrimes != 10001){
			if(isPrime(num)){
				numOfPrimes++;
			}
			num += 2;
		}
		System.out.println(num-2);
	}
	
	private static boolean isPrime(int num){
		if(num % 2 == 0)
			return false;
		for(int i = 3; i <= num/2; i += 2){
			if(num % i == 0)
				return false;
		}
		return true;
	}

}
