// You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
class MissingNumber
{
	int missingNumber(int arr[])
	{
		int res1=arr[0];
		int res2=1;
		for(int i=1 ;i<arr.length ; i++) 
			res1=res1 ^ arr[i];
		
		for(int i=2;i<=arr.length+1 ; i++)
			res2=res2 ^ i;
			
		return(res1^res2);
	}
}