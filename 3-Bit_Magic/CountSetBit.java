
// Brian Kirningam's Algorithm : When you subtract 1 from a number , all the bits after the last set bit becomes 1 , and the last set bit becomes 0

class CountSetBit
{
	int countSetBit(int n)
	{
		int res=0;
		while(n>0)
		{
			n=n & (n-1);
			res++;
		}
		return res;
		
	}
	
}