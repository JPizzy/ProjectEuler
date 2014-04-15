package problems;

public class Problem009 {

	/**
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 */
	public static void main(String[] args) {
		
		// a < b < c
		for(int ic = 100; ic <= 500; ic++){
			for(int ib = 100; ib <= ic; ib++){
				for(int ia = 100; ia <= ib; ia++){
					if(1000 == ia + ib + ic){
						if(ic == Math.sqrt(Math.pow(ia, 2) + Math.pow(ib, 2))){
							System.out.println(ia * ib * ic);
						}
					}
				}
			}
		}
	}
	
}
