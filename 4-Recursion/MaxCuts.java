import java.lang.Math.max();
class MaxCuts
{
	int maxCuts(int n,int a,int b,int c)
	{
		if(n==0) return 0;
		if(n<=0) return -1;
		int res=Math.max((maxCuts(n-a,a,b,c),maxCuts(n-b,a,b,c)),maxCuts(n-c,a,b,c));
		if(res==-1) return -1;
		return res+1;
	}
}