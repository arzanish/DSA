// given a number N , the task is find the XOR of the numbers from 1 to N.

class XOR_1_to_N
{
	int xor_1_to_N(int N)
	{
		if(N==0) return -1;
		int rem = N%4;
		if(rem==0) return N;
		if(rem==1) return 1;
		if(rem==2) return N+1;
		if(rem==3) return 0;
		return -1;
	}
}