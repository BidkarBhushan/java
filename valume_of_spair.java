import java.util.Scanner;
class valume_of_spair
{
	public static void main(String args[])
	{
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		r=sc.nextInt();

		float pi=3.14;
		double volume=(4.0/3.0)*pi*(r*r*r);


	    System.out.println("valume of sphere is = "+volume);
	}
}
