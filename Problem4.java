public class Problem4
{
	public static void main(String args [])
	{
		int biggestPalindrome = 0;
	for(int i=999;i>=100;i--)
	{
		for(int z=999;z>=100;z--)
		{
			int product = i * z;
			String palindrome = String.valueOf(product);
			String test2 = new StringBuilder(palindrome).reverse().toString();
			
			if(palindrome.equals(test2))
			{
				if(product>biggestPalindrome)
				biggestPalindrome = product;
		}
		}
	}
	System.out.println(biggestPalindrome);
	}
}