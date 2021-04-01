class Box
{
	double width;
	double height;
	double depth;

	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}


	public String toString(){
		return "Dimensions are "+width+" by "+height+" by "+depth;
	}
}
class toStringDemo
{
	public static void main(String[] args)
	{
		Box obj=new Box(12.33,22.33,33.33);
		System.out.print(obj);
	}	
}
