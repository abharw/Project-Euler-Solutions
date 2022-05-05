public class Problem6 {
	
	public static void main(String[] args) {
		int sumOfSquares = 0;
		for(int i = 1; i <= 100; i++) {
			sumOfSquares += (i * i);
		}
		System.out.println(sumOfSquares);
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		int squareOfSum = (sum * sum);
		System.out.println(squareOfSum);
		System.out.println(squareOfSum - sumOfSquares);
			
		
	}
}