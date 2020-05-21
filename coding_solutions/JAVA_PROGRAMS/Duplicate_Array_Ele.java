import java.util.*;
class Duplicate_Array_Ele
{
	public static void main(String args[])
	{	int f=0;
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();	
		int a[]=new int [n];
		
		for(int k=0;k<n;k++)
		{
			a[k]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
				System.out.println(a[j]);
				f=1;
				}
			}
		}
		if(f==0)
		System.out.println("-1");
	}	
}
