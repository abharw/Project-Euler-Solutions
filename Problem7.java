public class Project7
{
	public static void main(String [] args)
	{
		double i = 2;
		double primes = 3;
		double sqrt = 0;
		boolean isPrime = false;
		double lim = 10001;
		
		while(primes<=lim)
		{
			sqrt = Math.sqrt(i);
			for(double z=2;z<=sqrt;z++)
			{
				if((i%z)==0)
				{
					isPrime = false;
					break;
				}
				else
					isPrime = true;	
			}
			if(isPrime)
			{
				if(primes==lim)
				{
					System.out.println(Math.round(i));
					break;
				}
				primes+=1;
				i++;
			}
			else
				i++;
		}
	}
	}