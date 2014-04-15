package problems;

public class Problem003 {

	/**
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	public static void main(String[] args) {
		long num = 600851475143L;
		long lastFactor = 1;
		long factor = 3;
		
		// divide out 2 if possible
		if(num % 2 == 0){
			do{
				num /= 2;
			}while(num % 2 == 0);
			lastFactor = 2;
		}
		
		// keep dividing out factors until the largest prime factor is left
		while(num > 1){
			if(num % factor == 0){
				do{
					num /= factor;
				}while(num % factor == 0);
				lastFactor = factor;
			}
			factor += 2;
		}
		System.out.println("The largest prime factor is " + lastFactor);
	}
}
