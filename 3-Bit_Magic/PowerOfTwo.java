// Brian Kirningam's Algorithm : When dealing with power of two , only one bit will be set in a number

class PowerOfTwo
{
	Boolean isPowerOfTwo(int n)
	{
		if(n==0) return false;
		if((n & (n-1) )== 0) return true;
		else return false;
		
	}
}