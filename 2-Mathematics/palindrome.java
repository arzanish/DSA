public class palindrome
{
	public Boolean isPal(int n)
	{
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			int ld=temp%10;
			rev=rev*10 +ld;
			temp =temp/10;
		}
		return (n==rev);
	}
	
	public static void main(String[] args)
	{
		palindrome obj = new palindrome();
		System.out.println(obj.isPal(181));
		
	}
	
}
