import java.util.Scanner;
class area_of_circle
{
	public static void main(String args[])
    {
		int r;
		float pi=3.14f,area;
        Scanner sc=new Scanner(System.in);
		System.out.println("program for area of circle");
        System.out.print("Enter the radius = ");
        r=sc.nextInt();

		area=pi*r*r;

		System.out.println("Area of circle is ="+area);
	}
}



