class GCD_1
{
	int gcd_1(int a, int b)
	{
		int min=0;
		if(a<b) min=a; 
		else min=b;
		while(min!=0)
		{
			if(a%min==0 && b%min==0) return min;
			min=min-1;
		}
		return -1;
	}
}