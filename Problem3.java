public class projectEuler3{
	public static void main (String [] args)
	{
		double num = 600851475143D;
		double largestFactor = 1D;
		
		for(double i=3;i<=600851475143D;i+=2)
		{
				
			if((num % i) == 0)
			{
				if (i%largestFactor !=0 && i%71 !=0 && i%839!=0 && i%1471!=0)
				{
					System.out.println(i+ " is a prime factor.");
				}
				largestFactor = i;
				System.out.println(largestFactor);
			}
		}
	}
}