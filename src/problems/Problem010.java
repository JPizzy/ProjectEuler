package problems;

public class Problem010 {

	/**
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * Find the sum of all the primes below two million.
	 */
	public static void main(String[] args) {
		long sum = 0L;
		for(int i = 3; i < 2000000; i+=2){
			if(isPrime(i)){
				sum += i;
			}
		}
		System.out.println(sum);

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
