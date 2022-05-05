public class Project9
{
	public static void main(String [] args)
	{
		long c = 0;
		for(long a=0;a<=500; a++)
			{
				for(long b=0; b<=1000; b++)
				{
					c = 1000 - (a + b);
					if(((Math.pow(a,2) + Math.pow(b,2)) == Math.pow(c,2)) && ((a + b + c)==1000) && (a*b*c) !=0)
						System.out.println(a*b*c);
				}
			}
		}
}