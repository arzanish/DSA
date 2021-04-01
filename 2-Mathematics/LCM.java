class LCM
{  // a*b=gcd(a,b) * lcm(a,b)
	int lcm(int a , int b)
	{
		return (a*b)/gcd_3(a,b);
	}
	int gcd_3(int a , int b)
	{
		if(b==0) return a;
		else
		return gcd_3(b,a%b);
	}
	
}