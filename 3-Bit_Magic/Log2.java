class Log2
{
	int log2(int x)
	{
		int res=0;
		while((x=x>>1)!=0) res++;
		return res;
	}
}