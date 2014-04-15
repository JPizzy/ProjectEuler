package problems;

public class Problem006 {

	/**
	 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	 */
	public static void main(String[] args) {
		int num = 100;
		int solution;
		int sumOfSquares = 0;
		int squareOfSums = 0;
		
		for(int i = 1; i <= num; i++){
			sumOfSquares += Math.pow(i, 2);
			squareOfSums += i;
		}
		squareOfSums = (int) Math.pow(squareOfSums, 2);
		
		solution = squareOfSums - sumOfSquares;
		System.out.println(solution);
	}
}
