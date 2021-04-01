import java.lang.Math;
class PrintPowerSet
{
	void printPowerSet(String str)
	{
		int n= str.length();
		int powersize= (int)Math.pow(2,n);
		
		for(int counter=0 ; counter<powersize ; counter++)
		{
			for(int j=0; j<n ; j++)
			{
				if((counter & (1<<j)) !=0) System.out.print(str.charAt(j));
			}
			System.out.println(" ");
		}
	}
}