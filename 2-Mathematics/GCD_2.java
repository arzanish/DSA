class GCD_2
{
	int gcd_2(int a , int b)
	{
		if(b==0) return a;
		return gcd_2(b,a%b);
	}
}