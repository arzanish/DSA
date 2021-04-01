class print1ton
{
	void printn(int n)
	{
		if(n==0) return;
		printn(n-1);
		System.out.println(n);
		
	}
}