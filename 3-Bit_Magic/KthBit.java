class KthBit
{
	Boolean kthBitLeft(int n , int k)
	{
		if((n & (1 << (k-1))) ==1) return true;
		return false;
	}
	
	Boolean kthBitRight(int n , int k)
	{
		if(((n>>(k-1) )& 1) == 1) return true;
		else return false;
		
	}
}