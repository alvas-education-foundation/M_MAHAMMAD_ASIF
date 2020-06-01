import java.util.*;
public class NPR
{
	public static void main(String args[])
	{	int fact=1,result=0,fact1=1;
		Scanner sc=new Scanner(System.in);

			System.out.println("Enter the values of n and r seperated by spaces");
			int n=sc.nextInt();
			int r=sc.nextInt();
			int l=(n-r);
			for(int i=1;i<=n;i++)			//n!
			{
				fact=fact*i;
			} 
			for(int j=1;j<=l;j++)			//l=(n-r)!
			{
				fact1=fact1*j;
			}
			result=(fact/fact1);
			System.out.println("Value of nPr is:"+result); 

	}
}