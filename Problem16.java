import java.math.BigInteger;

public class Problem16
{
	public static void main(String [] args)
	{
		BigInteger number = new BigInteger("2");
		
		for(int i=1; i<1000;i++)
		{
			number = number.multiply(BigInteger.valueOf(2));
		}	
		String test = number.toString();
		
		int num = 0;
		int sum = 0;
		
		for(int x=0;x<test.length();x++)
		{
			num = Integer.parseInt(test.substring(x,x+1));
			sum += num;
		}
		
		System.out.println(sum);
		
	}
}