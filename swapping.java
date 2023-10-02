import java.util.Scanner;
class swapping
{
	public static void main(String args[])
	{
		int fno,sno,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("program for swapping of two Number1");

  		System.out.print("enter the first number = ");
  		fno=sc.nextInt();
  		System.out.print("enter the first number = ");
  		sno=sc.nextInt();
  		System.out.println("Before swapping \nfirst number = "+fno+" and second number ="+sno);

	    temp=fno;
		fno=sno;
		sno=temp;

		System.out.println("After Swapping ");
        System.out.println("first number = "+fno+" and second number ="+sno);


	}
}