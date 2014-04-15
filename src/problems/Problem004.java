package problems;

public class Problem004 {

	/**
	 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	public static void main(String[] args) {
		int largestPalindrome = 0;
		
		for(int q1 = 999; q1 > 99; q1--){
			for(int q2 = q1; q2 > 99; q2--){
				if(checkPalindrome(q1 * q2)){
					if(q1 * q2 > largestPalindrome){
						largestPalindrome = q1 * q2;
					}
				}
			}
		}
		System.out.println(largestPalindrome);
	}
	
	// Reverse the number and then compare the original to the reverse
	private static boolean checkPalindrome(int num){
		int reverse = 0;
		int startingNum = num;
		while(num > 0){
			reverse *= 10;
			reverse += num%10;
			num /= 10;
		}
		
		if(startingNum == reverse)
			return true;
		else
			return false;
	}

}
