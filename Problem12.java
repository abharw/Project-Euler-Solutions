public class Problem12
{
	public static void main(String [] args)
	{
		int numDivisors = 0;
		int naturalNum = 1;
		int triangleNum = 0;
		int howMany = 500;
		
		while(numDivisors < howMany)
		{
			triangleNum = triangleNum + naturalNum;
			
			int sqrt = (int) Math.sqrt(triangleNum);
			
			for(int i=1;i<=sqrt;i++)
			{
				if((triangleNum % i) == 0)
					numDivisors+=2;
				if (Math.pow(sqrt,2) == triangleNum) 
				    numDivisors--;
			}
			
			if(numDivisors < howMany)
					numDivisors=0;
			naturalNum ++;
		}
		System.out.println(triangleNum);
	}
}