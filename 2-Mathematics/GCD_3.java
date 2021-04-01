class GCD_3
{
	int gcd_3(int a , int b)
	{
		if(b==0) return a;
		else
		return gcd_3(b,a%b);
	}
}