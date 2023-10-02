import java.util.*;
class add
{
	public static void main(String args[])
	{
		int fno,sno,ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("program for arithmatic operators");
		System.out.println("program Addition of two number");
		System.out.println("enter the fisrst Number =");
		fno=sc.nextInt();
		System.out.println("enter the Second Number =");
		sno=sc.nextInt();
        System.out.print("Addition for two number is ="+(fno+sno));

        System.out.println("\nprogram for substraction of two number");
        System.out.println("enter the fisrst Number =");
		fno=sc.nextInt();
		System.out.println("enter the Second Number =");
		sno=sc.nextInt();
		System.out.print("substraction of two number is ="+(fno-sno));

        System.out.println("\nprogram for multiplaction of two number");
		System.out.println("enter the fisrst Number =");
		fno=sc.nextInt();
		System.out.println("enter the Second Number =");
	    sno=sc.nextInt();
		System.out.print("multiplaction of two number is ="+(fno*sno));

	    System.out.println("\nprogram for divison of two number");
	    System.out.println("enter the fisrst Number =");
		fno=sc.nextInt();
		System.out.println("enter the Second Number =");
	    sno=sc.nextInt();
		System.out.print("divison  of two number is ="+(fno/sno));
	}
}