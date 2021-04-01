class PrimeFactors
{
	void primeFactors(int n)
	{
		for(int i=2 ; i<n ; i++)
			{
				if(isPrime(i))
				{
					
					int x=i;
					while(n%x==0)
					{
						System.out.print(i+" ");
						x=x*i;
					}
				}
			}
		
	}
	
	Boolean isPrime(int n)
{
	if(n==1) return false;
	for(int i=2; i*i<=n ; i++)
	{
		if(n%i == 0) return false;
	}
	return true;
}
}