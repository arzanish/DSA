class factorial
{
	int fact(int n)
	{
		if(n==0) return 1;
		if(n<0) return -1;
		int res=1;
		while(n!=0)
		{
			res=res *n;
			n--;
		}
		return res;
	}
}