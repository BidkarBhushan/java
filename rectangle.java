import java.util.Scanner;
class rectangle
{
	public static void main(String args[])
	{
		int length,weight,area;
        Scanner sc=new Scanner(System.in);
		System.out.println("program of Rectangle");
		System.out.print("Enter the lenghth of  Rectangle = ");
		lengsth=sc.nextInt();
		System.out.print("Enter the weight of  Rectangle = ");
		weight=sc.nextInt();
		area=length*weight;

		System.out.println("Area of rectangle is =" + area);
	}
}