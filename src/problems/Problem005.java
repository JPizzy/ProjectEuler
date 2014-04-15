package problems;

public class Problem005 {

	/**
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */
	public static void main(String[] args) {
		// starting point is the product of all prime factors up to 20
		int primeFactors = 2*3*5*7*11*13*17*19;
		
		int num = primeFactors;
		boolean found = false;
		
		while(!found){
			found = true;
			// check divisibilty by 11-20
			// if divisible by 11-20 then has to be divisible by 1-10 as well
			for(int i = 11; i <= 20; i++){
				if(num % i != 0){
					found = false;
				}
			}
			if(found)
				System.out.println(num);
			num += primeFactors;
		}
		
	}
}
