import java.util.Scanner;
class square
{
	public static void main(String args[])
	{
		int fno,square;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the area of square = ");
		fno=sc.nextInt();

		square=fno*fno;
		System.out.println("square of = "+square);
	}
}